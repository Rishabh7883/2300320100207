package com.vehicle_maintenance_scheduler.vehicle_maintenance_scheduler.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req =
                (HttpServletRequest) request;

        System.out.println(
                "Request : "
                + req.getMethod()
                + " "
                + req.getRequestURI()
        );

        chain.doFilter(request,response);
    }
}
