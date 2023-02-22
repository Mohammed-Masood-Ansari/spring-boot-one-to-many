package com.jsp.springbootonetomany.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Oyo {

	@Id
	@Column(name = "oyoid")
	private int oyoId;
	@Column(name = "oyolocation")
	private String oyoLocation;
	@Column(name = "oyorating")
	private String oyoRating;
	
	@OneToMany(mappedBy = "oyo",cascade = CascadeType.ALL)
	private List<Room> rooms;

	public int getOyoId() {
		return oyoId;
	}

	public void setOyoId(int oyoId) {
		this.oyoId = oyoId;
	}

	public String getOyoLocation() {
		return oyoLocation;
	}

	public void setOyoLocation(String oyoLocation) {
		this.oyoLocation = oyoLocation;
	}

	public String getOyoRating() {
		return oyoRating;
	}

	public void setOyoRating(String oyoRating) {
		this.oyoRating = oyoRating;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
}
