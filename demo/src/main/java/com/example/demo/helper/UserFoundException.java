package com.example.demo.helper;

public class UserFoundException extends Exception {

    public UserFoundException() {
        super("User with this user name is already there in DB!! Try another user name");
    }

    public UserFoundException(String message){
        super(message);
    }
}
