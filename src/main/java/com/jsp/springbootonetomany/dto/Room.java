package com.jsp.springbootonetomany.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Room {

	@Id
	@Column(name = "roomid")
	private int roomId;
	@Column(name = "roomnumber")
	private int roomNumber;
	@Column(name = "roomtype")
	private String roomType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "oyoid")
	private Oyo oyo;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Oyo getOyo() {
		return oyo;
	}

	public void setOyo(Oyo oyo) {
		this.oyo = oyo;
	}
	
	
	
}
