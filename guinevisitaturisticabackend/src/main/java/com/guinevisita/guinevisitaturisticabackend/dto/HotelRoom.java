package com.guinevisita.guinevisitaturisticabackend.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "HotelRoom")
@Table(name = "hotelRoom")
public class HotelRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int room_Number;
	private boolean active=true;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_hotel")
	private Hotel hotel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	
	@ManyToOne(cascade = CascadeType.ALL)
	public Hotel getHotel() {
		return hotel;
	}
	
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public int getRoom_Number() {
		return room_Number;
	}
	public void setRoom_Number(int room_Number) {
		this.room_Number = room_Number;
	}
	
	
	
}
