package com.goudan.vhr.controller;

import com.goudan.vhr.model.Menu;
import com.goudan.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Program vhr
 * @Author GouDan
 * @Date 2021/4/28 15:13
 * @Description
 * @Version 1.0
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    private MenuService menuService;

    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }


    @RequestMapping(value = "menu", method = RequestMethod.GET)
    public List<Menu> getMenuByUserId() {
        return menuService.getMenuByUserId();
    }
}
