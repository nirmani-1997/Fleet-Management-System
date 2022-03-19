package com.example.demo.helper;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(){

        super("User with this User name is not found in DB!!");
    }
    public UserNotFoundException(String message){
        super(message);
    }
}
