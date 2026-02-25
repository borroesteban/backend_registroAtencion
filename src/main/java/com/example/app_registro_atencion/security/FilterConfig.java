package com.example.app_registro_atencion.security;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
    @Configuration
    public class FilterConfig {

    @Bean(name = "internalTokenFiltererRegistration")
    public
    FilterRegistrationBean<InternalTokenFilter> internalTokenFiltererRegistration(InternalTokenFilter filter) {
    FilterRegistrationBean<InternalTokenFilter> reg = new FilterRegistrationBean<>();
    reg.setFilter(filter);
    reg.addUrlPatterns("/api/*");
    reg.setOrder(Ordered.HIGHEST_PRECEDENCE);
    return reg;
     }
    }
