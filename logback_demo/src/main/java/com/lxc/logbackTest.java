package com.lxc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logbackTest {
    public  static  final Logger LOGGER = LoggerFactory.getLogger(logbackTest.class);

    //快速入门
    @Test
    public void testQuick() throws Exception{
//        for (int i = 0; i < 10000; i++) {
            //日志输出
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug");// 默认级别
            LOGGER.trace("trace");
//        }

    }
}
