package com.guinevisita.guinevisitaturisticabackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.guinevisita.guinevisitaturisticabackend.dao.CoordinateDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Coordinate;

public class CoordinateDAOImpl implements CoordinateDAO {
	
	
	private static List<Coordinate> coordinates =new ArrayList<>();

	@Override
	public List<Coordinate> list() {
		// TODO Auto-generated method stub
		return coordinates;
	}

	
	
	
	

}
