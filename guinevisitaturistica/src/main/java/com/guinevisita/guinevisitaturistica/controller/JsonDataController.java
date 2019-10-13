package com.guinevisita.guinevisitaturistica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guinevisita.guinevisitaturisticabackend.dao.HotelDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Hotel;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	@Autowired
	private HotelDAO hotelDAO;
	
	@RequestMapping("/all/hotels")
	@ResponseBody
	public List<Hotel> getAllHotels(){
		
		return hotelDAO.listActiveHotels();
	}
	
	
	@RequestMapping("/destination/{id}/hotels")
	@ResponseBody
	public List<Hotel> getHotelsByDestination(@PathVariable int id){
		
		return hotelDAO.listActiveHotelsbyDestination(id);
	}

}
