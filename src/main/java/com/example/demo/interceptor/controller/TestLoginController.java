package com.example.demo.interceptor.controller;

import com.example.demo.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lu.sa
 * @createtime 2018-10-29 18:52
 */
@RestController
@RequestMapping("/test")
public class TestLoginController {
    @Autowired
    private  RedisUtil redisUtil;

    @GetMapping("/setRedis")
    public boolean setRedis(String name) {
      boolean isOk =   redisUtil.set("name", name);

        return isOk;

    }

    @GetMapping("/getRedis")
    public String getRedis(String key) {
        String name   =   (String) redisUtil.get(key);

        return name;

    }


}

