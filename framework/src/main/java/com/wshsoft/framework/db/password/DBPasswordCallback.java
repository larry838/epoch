package com.wshsoft.framework.db.password;

import com.alibaba.druid.util.DruidPasswordCallback;
import com.wshsoft.framework.common.util.EncryptUtil;

import org.apache.commons.lang3.StringUtils;

import java.util.Properties;

/**
 * 数据库密码回调解密
 */
@SuppressWarnings("serial")
public class DBPasswordCallback extends DruidPasswordCallback {

    public void setProperties(Properties properties) {
        super.setProperties(properties);
        String pwd = properties.getProperty("password");
        if (StringUtils.isNotBlank(pwd)) {
            try {
                setPassword(EncryptUtil.decrypt(pwd).toCharArray());
            } catch (Exception e) {
                setPassword(pwd.toCharArray());
            }
        }
    }

    // 请使用该方法加密后，把密文写入classpath:/dbconfig.properties
    public static void main(String[] args) {
        System.out.println(EncryptUtil.encrypt("root"));
    }
}
