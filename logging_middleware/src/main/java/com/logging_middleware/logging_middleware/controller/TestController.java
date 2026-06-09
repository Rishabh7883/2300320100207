package main.java.com.logging_middleware.logging_middleware.controller;

import com.loggingmiddleware.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final LogService logService;

    public TestController(
            LogService logService) {

        this.logService = logService;
    }

    @GetMapping("/test")
    public String test(){

        logService.info(
                "Test endpoint called"
        );

        return "Logging Middleware Working";
    }
}