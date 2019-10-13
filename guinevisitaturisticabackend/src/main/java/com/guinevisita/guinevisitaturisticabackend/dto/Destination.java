package com.guinevisita.guinevisitaturisticabackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destination { 
	
	/**
	 * private fields
	 * 
	 * **/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String dest_name;
	@Column(name="address")
	private String dest_address;
	@Column(name="description")
	private String dest_description;
	@Column(name="image_url")
	private String dest_imageUrl;
	
	public int getId() {
		return id;
	}
	
	
	/**
	 * 
	 * Setters and Getters
	 * 
	 * **/
	public void setId(int id) {
		this.id = id;
	}
	public String getDest_name() {
		return dest_name;
	}
	public void setDest_name(String dest_name) {
		this.dest_name = dest_name;
	}
	public String getDest_address() {
		return dest_address;
	}
	public void setDest_address(String dest_address) {
		this.dest_address = dest_address;
	}
	public String getDest_description() {
		return dest_description;
	}
	public void setDest_description(String dest_description) {
		this.dest_description = dest_description;
	}
	public String getDest_imageUrl() {
		return dest_imageUrl;
	}
	public void setDest_imageUrl(String dest_imageUrl) {
		this.dest_imageUrl = dest_imageUrl;
	}


	@Override
	public String toString() {
		return "Destination [id=" + id + ", dest_name=" + dest_name + ", dest_address=" + dest_address
				+ ", dest_description=" + dest_description + ", dest_imageUrl=" + dest_imageUrl + "]";
	}
	
	
	
}
