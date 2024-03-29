package com.heroku.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heroku.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

