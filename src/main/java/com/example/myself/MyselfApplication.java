package com.example.myself;

import com.example.myself.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyselfApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyselfApplication.class, args);
    }

}
