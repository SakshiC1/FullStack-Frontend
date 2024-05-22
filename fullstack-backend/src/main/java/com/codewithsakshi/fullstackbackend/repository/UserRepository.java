package com.codewithsakshi.fullstackbackend.repository;

import com.codewithsakshi.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
