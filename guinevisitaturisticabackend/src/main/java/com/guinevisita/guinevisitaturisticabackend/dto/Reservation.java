package com.guinevisita.guinevisitaturisticabackend.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Reservation")
@Table(name = "reservation")
public class Reservation {
	
	/**
	 * 
	 * fields
	 * 
	 * **/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne  
	@JoinColumn(name="id_hotel")
	private Hotel hotel;
	
	
	@ManyToOne 
	@JoinColumn(name="id_user_detail")
	private User_detail user_detail;
	
	
	private Date start_date;
	private Date end_date;
	private double total_price=0;
	private int total_person=0;
	private int total_num_room=0;
	
	/*
	 * Constructors
	 * */
	
	
/*
	public Reservation() {
		
		if(total_person>=2) {
		total_price=(hotel.getPrice())*(total_person);
		}
		
		if(total_person==0 || total_person==1) {
			total_price=hotel.getPrice();
		}
		
		start_date=new Date();
		end_date=new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		format.format(start_date);
		format.format(end_date);
		
		/*
		if(end_date.equals(format.format(LocalDate.now()))) {
			
		}
		
		
	}


	/***
	 * getters and setters
	 * 
	 * ****/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * Date getters and setters
	 * **/
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public int getTotal_person() {
		return total_person;
	}
	public void setTotal_person(int total_person) {
		this.total_person = total_person;
	}


	public int getCountdays() {
		return total_num_room;
	}

	public void setCountdays(int countdays) {
		this.total_num_room = countdays;
	}



	public Hotel getHotel() {
		return hotel;
	}



	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}



	public User_detail getUser_detail() {
		return user_detail;
	}



	public void setUser_detail(User_detail user_detail) {
		this.user_detail = user_detail;
	}	
	

}
