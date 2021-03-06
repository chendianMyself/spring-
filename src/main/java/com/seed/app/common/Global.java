package com.seed.app.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 全局配置类
 * 
 * @author mtide
 *
 */
public class Global {
    private static Properties prop;
    private static ClassLoader classloader;
    private static InputStream in;
    
    static {
        prop = new Properties();
        classloader = Thread.currentThread().getContextClassLoader();
        in = classloader.getResourceAsStream("config/config.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 如果指定了配置文件路径，则使用指定配置文件初始化，否则用默认的
     * 
     * @param confPath
     */
    public static void initConfig(String confPath) {
        try {
            in = new FileInputStream(confPath);
            prop.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 从配置文件中获取配置
     * 
     * @param key
     * @return String
     */
    public static String getConfVal(String key) {
        return prop.getProperty(key);
    }

}
