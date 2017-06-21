package com.traveler.location;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
public class LocationApplication{

	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
	}

	@Bean
	public Module hibernate5Module() {
		return new Hibernate5Module();
	}
}
