package com.goudan.vhr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program vhr
 * @Author Goudan
 * @Date 2021/4/28 11:30
 * @Description
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }



    @RequestMapping(value = "/emp/basic/hello",method = RequestMethod.GET)
    public String hello2() {
        return "/emp/basic/hello";
    }


    @RequestMapping(value = "/emp/adv/hello",method = RequestMethod.GET)
    public String hello3() {
        return "/emp/adv/hello";
    }
}
