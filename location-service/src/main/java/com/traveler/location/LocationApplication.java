package com.traveler.location;

import com.traveler.location.domain.Location;
import com.traveler.location.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LocationApplication implements CommandLineRunner{
	@Autowired
	private LocationRepository locationRepo;

	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
	}

	public void run(String... args) {
		Location location = new Location();
		location.setName("China");
		location.setSize(Location.Size.COUNTRY);
	}
}
