package com.lxc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

    public  static  final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    //快速入门
    @Test
    public void test01() throws Exception{
        //日志输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");// 默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

}
