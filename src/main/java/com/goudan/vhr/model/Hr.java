package com.goudan.vhr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@ApiModel(value="com-goudan-vhr-model-Hr")
@Data
public class Hr implements UserDetails {
    /**
    * hrID
    */
    @ApiModelProperty(value="hrID")
    private Integer id;

    /**
    * 姓名
    */
    @ApiModelProperty(value="姓名")
    private String name;

    /**
    * 手机号码
    */
    @ApiModelProperty(value="手机号码")
    private String phone;

    /**
    * 住宅电话
    */
    @ApiModelProperty(value="住宅电话")
    private String telephone;

    /**
    * 联系地址
    */
    @ApiModelProperty(value="联系地址")
    private String address;

    @ApiModelProperty(value="")
    private Boolean enabled;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    @ApiModelProperty(value="")
    private String userface;

    @ApiModelProperty(value="")
    private String remark;

    public List<Role> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName())); //数据库中有前缀就不加 没有要加 ROLE_
        }
        return authorities;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}