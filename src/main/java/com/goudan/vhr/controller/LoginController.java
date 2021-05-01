package com.goudan.vhr.controller;

import com.goudan.vhr.model.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program vhr
 * @Author GouDan
 * @Date 2021/4/28 13:39
 * @Description
 * @Version 1.0
 */
@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ServerResponse login() {
        return ServerResponse.error("未登录请登录");
    }
}
