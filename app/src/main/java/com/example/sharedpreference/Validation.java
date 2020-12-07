package com.example.sharedpreference;

public class Validation {

    static String validate(User user){

        if(user.getName().equals("admin") && user.getPass().equals("admin")){
            return  "Success";
        }
        else{
            return "Failed";
        }
    }
}
