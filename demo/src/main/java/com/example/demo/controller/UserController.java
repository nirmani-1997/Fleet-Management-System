package com.example.demo.controller;


import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.helper.UserFoundException;
import com.example.demo.helper.UserNotFoundException;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import com.example.demo.helper.UserFoundException;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")

public class UserController {

    @Autowired
    private UserService userService;

    //creating user


    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {


        Set<UserRole> roles=new HashSet<>();

        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("Normal");


        UserRole userRole=new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return this.userService.createUser(user, roles);

    }


    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){

        return this.userService.getUser(username);
    }

    //get all user
    @GetMapping
    public ResponseEntity<?> getUser(){return ResponseEntity.ok(this.userService.getUser());}

    //delete the user by id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        this.userService.deleteUser(userId);
    }


//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<?> exceptionHandler(UserNotFoundException ex) {
//        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
//    }
//
    @ExceptionHandler(UserFoundException.class)
    public ResponseEntity<?> exceptionHandler(UserFoundException ex) {
        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }


//    update api
//    @PutMapping
//    public User updateUser(@RequestBody User user) {
//
//    }


}
