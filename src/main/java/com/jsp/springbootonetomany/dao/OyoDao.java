package com.jsp.springbootonetomany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootonetomany.dto.Oyo;
import com.jsp.springbootonetomany.repository.OyoRepository;

@Repository
public class OyoDao {

	@Autowired
	OyoRepository oyoRepository;
	
	public void saveOyo(Oyo oyo) {
		
		oyoRepository.save(oyo);
	}
}
