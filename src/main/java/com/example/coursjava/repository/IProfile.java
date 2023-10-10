package com.example.coursjava.repository;

import com.example.coursjava.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfile extends JpaRepository<Profile,Long> {

}
