package com.perth.project.Login.jwt;

import java.io.IOException;
import org.springframework.http.HttpHeaders;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.micrometer.common.util.StringUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        final String token = GetTokenFromRequest(request);
        if (token != null) {
            filterChain.doFilter(request, response);
            return;
        }
        filterChain.doFilter(request, response);
    }

    private String GetTokenFromRequest(HttpServletRequest request) {
        final String AuthHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (StringUtils.isNotEmpty(AuthHeader) && AuthHeader.startsWith("Bearer ")) {
            return AuthHeader.substring(7);
        }
        return null;
    }

}