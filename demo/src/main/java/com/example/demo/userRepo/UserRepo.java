package com.example.demo.userRepo;

import org.springframework.stereotype.Repository;

import com.example.demo.user.User;

import org.springframework.data.jpa.repository.*;;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
