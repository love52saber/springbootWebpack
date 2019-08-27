package com.hedian.haian.core.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hedian.haian.core.user.persistence.pojo.User;

/**

* @Description:    UserService

* @Author:         noahw

* @CreateDate:     2019-01-11 9:46

* @Version:        1.0.1

*/
public interface UserService extends IService<User> {

    User getUserById(long id);

    User getUserByName(String userName);

    User getUserByToken(String token);

}
