package com.example.jwtauthentication.security;

import com.example.jwtauthentication.security.jwt.AuthEntryPointJwt;
import com.example.jwtauthentication.service.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSecurityConfig {
    @Autowired
    UserDetailServiceImpl userDetailService;
    @Autowired
    AuthEntryPointJwt authEntryPointJwt;


}
