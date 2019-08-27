package com.hedian.haian.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**

* @Description:    项目路径工具

* @Author:         noahw

* @CreateDate:     2019-02-27 14:05

* @Version:        1.0

*/
@Slf4j
public class PathUtil {

    /**
     * 获取jar包所在绝对路径
     * @return String
     */
    public static String getProjectPath(){
        ApplicationHome home = new ApplicationHome(PathUtil.class);
        File jarFile = home.getSource();
        return jarFile.getParentFile().toString();
    }

    /**
     * 获取classes所在绝对路径
     * @return String
     */
    public static String getClassesPath(){
        try {
            return ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            log.error(e.getMessage());
            return "";
        }
    }
}
