package com.example.coursjava;

import com.example.coursjava.entities.User;
import com.example.coursjava.repository.IProfile;
import com.example.coursjava.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursJavaApplication implements CommandLineRunner {


    @Autowired
    IUser uRepos ;
    @Autowired
    IProfile pRepos;

    public static void main(String[] args) {
        SpringApplication.run(CoursJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setUsername("youssef");
        user1.setPassword("password");
        uRepos.save(user1);

    }
}
