package com.example.jwtauthentication.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
@RequiredArgsConstructor
public class jwtFilter  extends OncePerRequestFilter {
    private final JWTService jwtService;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        final String authenHeader = request.getHeader("Authorization");
        final String jwt;
        final String userEmail;
        if (authenHeader==null||!authenHeader.startsWith("Bearer")){
            filterChain.doFilter(request, response);
            return; // We can call return in order to stop execution of rest of code
        }
        jwt=authenHeader.substring(7);
        userEmail=jwtService.extractUsername(jwt);

    }
}
