
package com.jsp.springbootonetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootonetomany.dao.RoomDao;
import com.jsp.springbootonetomany.dto.Room;
import com.jsp.springbootonetomany.service.RoomService;

@RestController
public class RoomController {

	@Autowired
	RoomService roomService;
	
	@Autowired
	RoomDao dao;

	@PostMapping("/saveRoomDetails")
	public void saveRoom(@RequestBody List<Room> room) {

		roomService.saveRoom(room);
	}

	@PutMapping("/updateRoom/{roomId}")
	public void update(@PathVariable int roomId, @RequestBody Room room) {

		dao.update(roomId, room);
	}
}
