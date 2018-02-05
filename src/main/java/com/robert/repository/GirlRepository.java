package com.robert.repository;

import com.robert.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    List<Girl> findByAge(Integer age);
}
