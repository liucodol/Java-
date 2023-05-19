package com.lxc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test {

    // 定义日志记录器对象
    public static final Logger LOGGER = LogManager.getLogger();

    //快速入门
    @Test
    public void testQuick() throws Exception{
        //日志输出
        LOGGER.fatal("fatal");
        LOGGER.error("error");//默认级别
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
