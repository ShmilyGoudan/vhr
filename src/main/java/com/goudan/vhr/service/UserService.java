package com.goudan.vhr.service;

import com.goudan.vhr.mapper.HrMapper;
import com.goudan.vhr.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Program vhr
 * @Author Goudan
 * @Date 2021/4/28 11:14
 * @Description
 * @Version 1.0
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;


    @Override
    public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(Username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在 ");
        }
        return hr;
    }
}
