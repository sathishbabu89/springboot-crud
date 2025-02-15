package com.example.react.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.react.crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
