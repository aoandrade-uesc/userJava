package com.devsuperior.usrDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.usrDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
