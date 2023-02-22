package com.jsp.springbootonetomany.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootonetomany.dto.Room;
import com.jsp.springbootonetomany.repository.RoomRepository;

@Repository
public class RoomDao {

	@Autowired
	RoomRepository repository;
	
	public void saveRoom(List<Room> rooms) {
		
		repository.saveAll(rooms);
	}
	
	public void update(int roomId,Room room) {
		
		List<Room> rooms=repository.findAll();
		
		for (Room room2 : rooms) {
			
			if(room2.getRoomId()==roomId) {
				
				room2.setRoomNumber(room.getRoomNumber());
				
				repository.save(room2);
			}
		}
	}
}
