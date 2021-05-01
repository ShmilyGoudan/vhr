package com.goudan.vhr.model;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconcls;

    private Integer parentid;

    private Boolean enabled;

    private List<Menu> children;
    private List<Role> roles;
}