package com.nacho.curso.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nacho.curso.springboot.error.springbooterror.models.domain.User;

@Configuration
public class AppConfig {
 
    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Nacho", "Perez"));
        users.add(new User(2L, "Carlos", "Mascarell"));
        users.add(new User(3L, "Ana", "Sanchez"));
        users.add(new User(4L, "Laura", "Soriano"));
        users.add(new User(5L, "Rafael", "Lopez"));
        return users;
    }
}
