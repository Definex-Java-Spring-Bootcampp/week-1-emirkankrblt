package com.patika.kredinbizdenservice;

import com.patika.kredinbizdenservice.model.User;
import com.patika.kredinbizdenservice.service.userService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class KredinbizdenServiceApplication {
    private static final userService us = new userService();
    public static void main(String[] args) {
        SpringApplication.run(KredinbizdenServiceApplication.class, args);
        User user1=new User("ali","kisa","abc@example.com", "abc123", "999999999", true);
        User user2=new User("ahmet","uzun","abc@example.com", "xyz111", "111111111", true);
        us.addUser(user1);
        us.addUser(user2);

        System.out.println(us.getUsers().toString());
    }




}
