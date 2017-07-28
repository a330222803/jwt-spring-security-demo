package org.zerhusen.security.controller;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DevicePlatform;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.model.security.Authority;
import org.zerhusen.model.security.AuthorityName;
import org.zerhusen.model.security.User;
import org.zerhusen.security.JwtTokenUtil;
import org.zerhusen.security.JwtUser;
import org.zerhusen.security.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
public class UserRestController {
    private final Log logger = LogFactory.getLog(this.getClass());

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return user;
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Map registerUser(HttpServletRequest request) {
        //TODO
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User newuser = new User();
        newuser.setUsername(username);
        newuser.setEmail(email);
        newuser.setPassword(password);
        newuser.setEnabled(true);
        newuser.setFirstname("aaaa");
        newuser.setLastname("bbbb");
        newuser.setLastPasswordResetDate(new Date());
        List list = new ArrayList<Authority>();
        Authority authority = new Authority();
        authority.setId(1L);
        authority.setName(AuthorityName.ROLE_USER);
        List list1 = new ArrayList<User>();
        list1.add(newuser);
        authority.setUsers(list1);
        list.add(authority);
        newuser.setAuthorities(list);
        logger.info(JSON.toJSONString(newuser,true));
        newuser.setPassword(passwordEncoder.encode(newuser.getPassword()));
        userRepository.save(newuser);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        String token = jwtTokenUtil.generateToken(userDetails, new Device() {
            @Override
            public boolean isNormal() {
                return false;
            }

            @Override
            public boolean isMobile() {
                return true;
            }

            @Override
            public boolean isTablet() {
                return false;
            }

            @Override
            public DevicePlatform getDevicePlatform() {
                return null;
            }
        });
        Map map = new HashMap<>();
        map.put("token", token);
        return map;
    }

}
