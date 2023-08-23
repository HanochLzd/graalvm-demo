package com.hanoch.graalvmdemo.filter;

import com.google.common.base.Stopwatch;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Slf4j
@Component
public class TimestampFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        String requestID = UUID.randomUUID().toString();
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Stopwatch stopwatch = Stopwatch.createStarted();
        try {
            log.info("requestId: {}, requestUrl: {}.", requestID, request.getRequestURI());
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            log.info("requestId: {}, it takes {}.", requestID, stopwatch.stop());
        }
    }
}
