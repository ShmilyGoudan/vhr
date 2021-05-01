package com.goudan.vhr.config;


import com.goudan.vhr.model.Menu;
import com.goudan.vhr.model.Role;
import com.goudan.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * 根据用户传来的url 分析出需要的权限
 */

@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {
    AntPathMatcher antPathMatcher = new AntPathMatcher();

    private MenuService menuService;
    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //获取路由地址
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        //获取数据库角色
        List<Menu> menuAll = menuService.getAllMenusRole();
        for (Menu menu : menuAll) {
            //和数据库的路径去匹配 有相同的就返回匹配数据   没有就返回默认
            if (antPathMatcher.match(menu.getPath(), requestUrl)) {
                List<Role> roles = menu.getRoles();
                String[] resourceIds = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    resourceIds[i] = roles.get(i).getName();
                }
                //匹配到就把角色返回 交给下一步处理对比
                return SecurityConfig.createList(resourceIds);
            }
        }
        //全部不匹配 返回默认值再去处理
        return SecurityConfig.createList("ROLE_login");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
