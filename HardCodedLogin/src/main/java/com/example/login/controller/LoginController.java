package com.example.login.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.entity.LoginRequest;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

	@PostMapping("/login-static")
	public ResponseEntity<String> login(@RequestBody LoginRequest request){
		String username=request.getUsername();
		String password=request.getPassword();
		if(username.equals("admin") && password.equals("password123")) {
			return ResponseEntity.ok("Authentication Successfull");
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication Failed");
	}
}
