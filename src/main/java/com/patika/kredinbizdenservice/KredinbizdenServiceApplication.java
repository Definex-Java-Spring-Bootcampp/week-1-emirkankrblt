package com.patika.kredinbizdenservice;

import com.patika.kredinbizdenservice.model.*;
import com.patika.kredinbizdenservice.service.userService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@SpringBootApplication
public class KredinbizdenServiceApplication {

    //Task 3 Singleton pattern
    private static final userService us = userService.getInstance();
    public static void main(String[] args) {
        SpringApplication.run(KredinbizdenServiceApplication.class, args);
        //Task 4.1 and 4.2 User created with same email and sha 512 is used for password
        User user1=new User("ali","kisa","abc@example.com", "abc123", "999999999", true);
        User user2=new User("ahmet","uzun","abc@example.com", "xyz111", "111111111", true);
        // User2 wont be saved. It will be used to show email uniqueness property
        us.addUser(user1);
        us.addUser(user2);

        User user3=new User("veli","orta","prs@example.com", "xyz111", "111111111", true);

        LocalDate dateTime = LocalDate.now();

        ConsumerLoan loan1=new ConsumerLoan(10000,6,2.5);
        Application app11=new Application(loan1,user1, dateTime.minusDays(2).atStartOfDay());
        Application app12=new Application(loan1,user1, dateTime.minusDays(2).atStartOfDay());
        Application app13=new Application(loan1,user1, dateTime.minusDays(2).atStartOfDay());


        ConsumerLoan loan2=new ConsumerLoan(20000,6,2.5);
        Application app21=new Application(loan2,user2, dateTime.minusDays(5).atStartOfDay());
        Application app22=new Application(loan2,user2, dateTime.minusDays(5).atStartOfDay());
        // TASK 4.3 Most application printing. Ali will be printed (3 APPLICATIONS)
        System.out.println(us.userMostApplied().getName());

        // TASK 4.4
        System.out.println(us.highestLoanApplication().entrySet().iterator().next() );




    }




}
