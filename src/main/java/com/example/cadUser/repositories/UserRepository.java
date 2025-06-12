package com.example.cadUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadUser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
