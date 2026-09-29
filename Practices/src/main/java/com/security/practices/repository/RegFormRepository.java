package com.security.practices.repository;

import com.security.practices.entities.RegFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegFormRepository extends JpaRepository<RegFormEntity, Integer> {

}
