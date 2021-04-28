package com.goudan.vhr.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.goudan.vhr.model.Hr;
import com.goudan.vhr.model.ServerResponse;
import com.goudan.vhr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Program vhr
 * @Author Goudan
 * @Date 2021/4/28 11:24
 * @Description 权限配置类
 * @Version 1.0
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginProcessingUrl("/dologin")
                .loginPage("/login")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json; charset=UTF-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        Hr hr = (Hr) authentication.getPrincipal();
                        hr.setPassword(null);
                        String asString = new ObjectMapper().writeValueAsString(ServerResponse.success("登陆成功", hr));
                        out.write(asString);
                        out.flush();
                        out.close();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {

                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json; charset=UTF-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        ServerResponse serverResponse = ServerResponse.error("登录失败");
                        if (e instanceof LockedException) {
                            serverResponse.setMsg("账户被锁定");
                        } else if (e instanceof CredentialsExpiredException) {
                            serverResponse.setMsg("密码过期");
                        } else if (e instanceof AccountExpiredException) {
                            serverResponse.setMsg("账户过期");
                        } else if (e instanceof DisabledException) {
                            serverResponse.setMsg("账户禁用");
                        } else if (e instanceof BadCredentialsException) {
                            serverResponse.setMsg("用户名或密码错误");
                        }
                        out.write(new ObjectMapper().writeValueAsString(serverResponse));
                        out.flush();
                        out.close();
                    }
                })
                .permitAll()
                .and()
                .logout()
                .logoutSuccessHandler(new LogoutSuccessHandler() {

                    @Override
                    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json; charset=UTF-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        out.write(new ObjectMapper().writeValueAsString(ServerResponse.success("注销成功")));
                        out.flush();
                        out.close();
                    }
                })
                .permitAll()
                .and()
                .csrf().disable();
    }
}
