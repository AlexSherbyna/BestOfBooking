package com.bob;

import com.bob.entity.Booking;
import com.bob.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BobApplication {

	public static void main(String[] args) {

		Booking booking = new Booking();
		User user = new User();
		booking.setAppUser(user);
		System.out.println(booking);
		user.setBooking(List.of(booking));

		SpringApplication.run(BobApplication.class, args);
		System.out.println(user);
		System.out.println(booking);
	}

}
