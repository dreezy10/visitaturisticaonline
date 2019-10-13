package com.guinevisita.guinevisitaturisticabackend.dto;

public class Coordinate{

	
	/**
	 * private fields
	 * 
	 * **/
	
	private int id;
	private String coordinate_name;
	private double latitude;
	private double longitude;
	
	
	/**
	 * 
	 * Setters and Getters
	 * 
	 * **/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCoordinate_name() {
		return coordinate_name;
	}
	public void setCoordinate_name(String coordinate_name) {
		this.coordinate_name = coordinate_name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
