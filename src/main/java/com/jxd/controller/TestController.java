package com.jxd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-09 14:10
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "ok";
    }
}
