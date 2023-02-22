package com.jsp.springbootonetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootonetomany.dto.Oyo;
import com.jsp.springbootonetomany.service.OyoService;

@RestController
public class OyoController {

	@Autowired
	OyoService oyoService;

	@PostMapping("/saveOyoDetails")
	public void saveOyo(@RequestBody Oyo oyo) {

		oyoService.saveOyo(oyo);
	}
}
