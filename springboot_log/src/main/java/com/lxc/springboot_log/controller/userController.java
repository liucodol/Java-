package com.lxc.springboot_log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/test")
    public String test(@RequestParam("user") String user){
        logger.info("用户控制器给前端返回一段话");
        return  user+"欢迎使用日志框架";
    }
}
