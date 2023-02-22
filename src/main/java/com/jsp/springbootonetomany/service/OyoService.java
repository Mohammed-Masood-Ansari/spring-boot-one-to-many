package com.jsp.springbootonetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootonetomany.dao.OyoDao;
import com.jsp.springbootonetomany.dto.Oyo;

@Service
public class OyoService {

	@Autowired
	OyoDao dao;
	
	public void saveOyo(Oyo oyo) {

		dao.saveOyo(oyo);
	}
}
