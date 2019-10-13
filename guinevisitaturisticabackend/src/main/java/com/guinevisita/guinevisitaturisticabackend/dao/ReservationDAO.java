package com.guinevisita.guinevisitaturisticabackend.dao;

import java.util.List;

import com.guinevisita.guinevisitaturisticabackend.dto.Reservation;

public interface ReservationDAO {
	
	boolean addReservation(Reservation reservation);
	boolean update (Reservation reservation);
	boolean delete (Reservation reservation);
	List <Reservation>listReservation (Reservation reservation);
	
	/*
	 * others methods
	 * **/
	
	boolean journeyEnd (Reservation reservation);
	
}
