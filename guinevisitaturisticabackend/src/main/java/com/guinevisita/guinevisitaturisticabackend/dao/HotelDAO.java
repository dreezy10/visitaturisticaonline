package com.guinevisita.guinevisitaturisticabackend.dao;

import java.util.List;

import com.guinevisita.guinevisitaturisticabackend.dto.Hotel;

public interface HotelDAO {
	
	
	
	Hotel get(int hotelId);
	boolean addHotel(Hotel hotel);
	boolean updateHotel(Hotel hotel);
	boolean deleteHotel(Hotel hotel);
	List<Hotel> list();
	
	/**
	 * all others methods
	 * **/
	List<Hotel> listActiveHotels();
	List<Hotel> getLatestActiveHotels(int count);
	List<Hotel> listActiveHotelsbyDestination(int destination_id);

}
