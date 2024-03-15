package com.patika.kredinbizdenservice.service;

import com.patika.kredinbizdenservice.model.Application;
import com.patika.kredinbizdenservice.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class userService {
    private final List<User> users = new ArrayList<>();
    private static userService userServiceObject=null;
    HashMap<Double,User> hash;
    public  List<User> getUsers() {
        return users;
    }

    public static userService getInstance(){
        if(userServiceObject==null){
            userServiceObject=new userService();
        }
        return userServiceObject;
    }

    public void addUser(User user1) {
        if(isEmailUnique(user1.getEmail())){
            users.add(user1);
            System.out.println("user saved");
        }
        else{
            System.out.println("this user email already saved");
        }
    }
    
    public boolean isEmailUnique(String userEmail){
        for (User user: users) {
            if(user.getEmail().equals(userEmail)){
                return false;
            }
        }
        return true;
    }


    public User userMostApplied(){
        int maxApplication=0;
        User tempUser=null;
        for (User userl:users) {
            int applicationCount = userl.getApplicationList().size();
            if (applicationCount > maxApplication) {
                maxApplication = applicationCount;
                tempUser = userl;
            }
        }
        return tempUser;
    }


    public HashMap<Double, User> highestLoanApplication(){
        hash=new HashMap<Double, User>();
        double maxLoan=0;
        User tempUser=null;
        for (User userl:users) {

            for (Application app:userl.getApplicationList()) {
                double tempLoan = app.getLoan().getAmount();
                if(tempLoan > maxLoan){
                    maxLoan=tempLoan;
                    tempUser=userl;
                }
            }
        }
        System.out.println(maxLoan);
        hash.put(maxLoan,tempUser);
        return hash;
    }
}
