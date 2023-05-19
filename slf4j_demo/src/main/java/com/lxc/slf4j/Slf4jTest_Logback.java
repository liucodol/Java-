package com.lxc.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//logback 日志实现
public class Slf4jTest_Logback {

    public  static  final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest_Logback.class);

    //快速入门
    @Test
    public void test01() throws Exception{
        //日志输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");// 默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");

        //使用占位符输出日志信息
        String name = "lxc";
        Integer age = 25;
        LOGGER.info("user:{},{}",name,age);

        //将系统的异常信息输出
        try {
            int i = 1/0;
        }catch (Exception e){
//            e.printStackTrace();
            LOGGER.error("error",e);
        }


    }

}
