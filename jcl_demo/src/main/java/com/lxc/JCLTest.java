package com.lxc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JCLTest {
    @Test
    public  void testQuick() throws  Exception{
        //获取 log 日志记录器对象
        Log log = LogFactory.getLog(JCLTest.class);
//        Log log = LogFactory.getLog("com");
        //日志记录输出
        log.info("hello jcl");
    }
}
