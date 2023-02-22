package com.jsp.springbootonetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootonetomany.dao.RoomDao;
import com.jsp.springbootonetomany.dto.Room;

@Service
public class RoomService {

	@Autowired
	RoomDao dao;
	
	public void saveRoom(List<Room> room) {

		dao.saveRoom(room);
	}
}
