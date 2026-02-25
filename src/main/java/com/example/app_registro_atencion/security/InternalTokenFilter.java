
package com.example.app_registro_atencion.security;

import ch.qos.logback.classic.spi.ILoggingEvent;
import com.example.app_registro_atencion.exception.ErrorDetails;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Console;
import java.io.IOException;

import static java.rmi.server.LogStream.log;

@Component
public class InternalTokenFilter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(InternalTokenFilter.class);
    @Value("${security.internal-token}")
    private String expectedToken;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        System.out.println("expectedToken "+ expectedToken);
        System.out.println("path=" + request.getRequestURI());
        System.out.println("header=" + request.getHeader("X-Internal-Token"));
        System.out.println("expected=" + expectedToken);
        String path = request.getRequestURI();
        if (!path.startsWith("/api/")) {
            chain.doFilter(req, res);
            return;
        }

        String token = request.getHeader("X-Internal-Token");
        if (token == null || !token.equals(expectedToken)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        log();
        }
        chain.doFilter(req, res);
        }




        public void log(){
            System.out.println("expectedToken "+ expectedToken);
        }

        }


