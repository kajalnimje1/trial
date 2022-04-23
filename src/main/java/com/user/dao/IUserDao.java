package com.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entities.User;
@Repository
public interface IUserDao extends JpaRepository<User, Long> {

}
