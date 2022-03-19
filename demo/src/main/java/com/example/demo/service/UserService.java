package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    public Set<User> getUser();


    //delete user by id
    void deleteUser(Long userId);
}
