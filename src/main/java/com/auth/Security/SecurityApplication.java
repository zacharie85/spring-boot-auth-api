package com.auth.Security;

import com.auth.Security.auth.AuthenticationService;
import com.auth.Security.auth.RegisterRequest;
import com.auth.Security.user.User;
import com.auth.Security.user.UserRepository;
import com.auth.Security.youtubeAccount.YoutubeAccount;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static com.auth.Security.user.Role.ADMIN;
import static com.auth.Security.user.Role.MANAGER;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
