package com.hedian.haian.core.user.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hedian.haian.constants.CommonConstant;
import com.hedian.haian.core.user.persistence.mapper.UserMapper;
import com.hedian.haian.core.user.persistence.pojo.User;
import com.hedian.haian.core.user.service.UserService;
import com.hedian.haian.exception.BusinessException;
import com.hedian.haian.util.JedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: UserServiceImpl
 * @Author: noahw
 * @CreateDate: 2019-01-11 9:47
 * @Version: 1.0.1
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private JedisUtil jedisUtil;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        return userMapper.selectById(id);
    }

    @Override
    public User getUserByName(String userName) {
        User condition = new User();
        condition.setUserName(userName);
        //User user=baseMapper.selectOne(condition);
        if (userName.isEmpty()) {
            throw new BusinessException("用户名不能为空");
        }
        List<User> list = this.list(new QueryWrapper<User>().eq("user_name", condition.getUserName()));
        if (list == null || list.size() == 0) {
            return null;
        } else {
            if (list.size() > 1) {
                throw new BusinessException("用户名重复,请检查数据！");
            } else {
                return list.get(0);
            }
        }
    }

    @Override
    public User getUserByToken(String token) {
        String userStr = jedisUtil.get(String.format(CommonConstant.USER_TOKEN_PREX, token), CommonConstant.REDIS_INDEX);
        User user = new User();
        if (userStr != null && !userStr.isEmpty()) {
            user = JSONObject.parseObject(userStr, User.class);
        }
        if (user == null) {
            throw new ShiroException("用户未登录或登录超时");
        }
        return user;
    }


}
