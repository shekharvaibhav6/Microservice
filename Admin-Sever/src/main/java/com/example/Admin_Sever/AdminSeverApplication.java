package com.example.Admin_Sever;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminSeverApplication.class, args);
	}

}
