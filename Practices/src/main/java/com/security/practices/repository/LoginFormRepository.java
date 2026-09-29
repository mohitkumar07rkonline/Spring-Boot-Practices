package com.security.practices.repository;

import com.security.practices.entities.LoginPageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginFormRepository extends JpaRepository<LoginPageEntity, Integer> {
}
