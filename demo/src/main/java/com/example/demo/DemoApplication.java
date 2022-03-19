package com.example.demo;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		User user = new User();
//		user.setFirstName("Dilini");
//		user.setLastName("Priyangika");
//		user.setUsername("dilini");
//		user.setPassword("bcd");
//		user.setEmail("bcd@gmail.com");
//		user.setProfile("default.png");
//		user.setAddress("Kandy");
//		user.setContactNo("0714545856");
////		user.setDateOfBirth("19");
//
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("Admin");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//
//		UserRole userRole = new UserRole();
//
//		userRole.setRole(role1);
//
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1=this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());

	}
}
