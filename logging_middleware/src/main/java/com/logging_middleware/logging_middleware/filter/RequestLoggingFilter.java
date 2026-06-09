package main.java.com.logging_middleware.logging_middleware.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class RequestLoggingFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req =
                (HttpServletRequest) request;

        System.out.println(
                "\n========================="
        );

        System.out.println(
                "Time : "
                + LocalDateTime.now()
        );

        System.out.println(
                "Method : "
                + req.getMethod()
        );

        System.out.println(
                "URI : "
                + req.getRequestURI()
        );

        System.out.println(
                "=========================\n"
        );

        chain.doFilter(request,response);
    }
}