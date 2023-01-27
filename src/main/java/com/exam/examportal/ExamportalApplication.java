package com.exam.examportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.exam.examportal.helper.UserFoundException;
import com.exam.examportal.model.Role;
import com.exam.examportal.model.User;
import com.exam.examportal.model.UserRole;
import com.exam.examportal.service.UserService;

@SpringBootApplication
@CrossOrigin("*")
public class ExamportalApplication implements CommandLineRunner{
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception

	{
		/*
		User user = new User();
		user.setFirstName("Tahesin");
		user.setLastName("Khatik");
		user.setUsername("Daniyyal");
		user.setPassword("sama@123");
		user.setProfile("default.png");
		user.setEmail("tahasinkhatik02@gmail.com");
		user.setPhone("8668819041");
		Role role1 = new Role();
		role1.setRoleId(44l);
		role1.setRoleName("ADMIN");
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		User user1 = this.userService.createUser(user,userRoleSet);
		System.out.println(user1.getUsername());
		*/
	}
}
