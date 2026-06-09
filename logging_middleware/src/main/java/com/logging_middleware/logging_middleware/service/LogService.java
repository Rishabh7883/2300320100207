package main.java.com.logging_middleware.logging_middleware.service;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LogService {

    public void info(String message){

        System.out.println(
                "[INFO] "
                + LocalDateTime.now()
                + " : "
                + message
        );
    }

    public void error(String message){

        System.out.println(
                "[ERROR] "
                + LocalDateTime.now()
                + " : "
                + message
        );
    }
}
