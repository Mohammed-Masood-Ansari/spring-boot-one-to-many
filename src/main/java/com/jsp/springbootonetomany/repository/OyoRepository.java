package com.jsp.springbootonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.springbootonetomany.dto.Oyo;

public interface OyoRepository extends JpaRepository<Oyo, Integer> {

	
}
