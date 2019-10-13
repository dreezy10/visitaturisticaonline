package com.guinevisita.guinevisitaturisticabackend.dao;

import java.util.List;

import com.guinevisita.guinevisitaturisticabackend.dto.Destination;

public interface DestinationDAO {
	
	

List<Destination> listDestination();
Destination get(int id);
boolean addDestination(Destination destination);
boolean update(Destination destination);
boolean delete(Destination destination);


}
