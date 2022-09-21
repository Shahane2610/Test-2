package com.OneToOneMapping.Project;

import com.OneToOneMapping.Project.Entity.Gender;
import com.OneToOneMapping.Project.Entity.User;
import com.OneToOneMapping.Project.Entity.UserProfile;
import com.OneToOneMapping.Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Shahane");
		user.setEmail("shahane@gmail.com");

		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Delhi");
		userProfile.setBirthOfDate(LocalDate.of(2000, 10, 26));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("74503094309");

		user.setUserProfile(userProfile);
		userProfile.setUser(user);

		userRepository.save(user);
	}
}
