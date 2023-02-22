package com.jsp.springbootonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootonetomany.dto.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}
