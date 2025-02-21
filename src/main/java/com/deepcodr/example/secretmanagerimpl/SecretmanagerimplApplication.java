package com.deepcodr.example.secretmanagerimpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecretmanagerimplApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretmanagerimplApplication.class, args);
		System.out.println("Started Secret Manager Application" );
	}

}
