package com.goudan.vhr.service;

import com.goudan.vhr.mapper.MenuMapper;
import com.goudan.vhr.model.Hr;
import com.goudan.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program vhr
 * @Author GouDan
 * @Date 2021/4/28 15:16
 * @Description
 * @Version 1.0
 */
@Service
public class MenuService {


    private MenuMapper menuMapper;

    @Autowired
    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }


    public List<Menu> getMenuByUserId() {

        return menuMapper.getMenuByUserId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public List<Menu> getAllMenusRole() {
        return menuMapper.getAllMenusRole();
    }
}
