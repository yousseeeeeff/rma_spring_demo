package com.example.coursjava.repository;

import com.example.coursjava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUser extends JpaRepository<User , Long> {
    public User findByUsername(String nom);
    public User findByUsernameAndPassword(String n , String p );
    public List<User> findByUsernameContainingIgnoreCase(String mc);
    public List<User> findByProfileNom(String n );
    @Query("from User  u where u.profile.prenom.size> ?1")
    public List<User> abc(int nb);
    }