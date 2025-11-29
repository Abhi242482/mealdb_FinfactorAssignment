package com.example.mealdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MealdbExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealdbExplorerApplication.class, args);
	}

}
