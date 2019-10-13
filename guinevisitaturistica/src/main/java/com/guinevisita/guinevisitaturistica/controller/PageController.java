package com.guinevisita.guinevisitaturistica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guinevisita.guinevisitaturisticabackend.dao.DestinationDAO;
import com.guinevisita.guinevisitaturisticabackend.dao.HotelDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Destination;
import com.guinevisita.guinevisitaturisticabackend.dto.Hotel;

@Controller
public class PageController {
	
	@Autowired
	DestinationDAO destinationDAO;
	
	@Autowired
	HotelDAO hotelDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView view() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","accueil");
		modelandview.addObject("userclickhome",true);
		
		return modelandview;
	}
	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","contact");
		modelandview.addObject("userclickcontact",true);
		
		return modelandview;
	}
	
	
	
	
	@RequestMapping(value = "/gastronomie")
	public ModelAndView gastro() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","gastronomie");
		modelandview.addObject("userclickgastro",true);
		
		return modelandview;
	}
	
	@RequestMapping(value = "etnic")
	public ModelAndView etnic() {
		ModelAndView modelandview=new ModelAndView("page");
		modelandview.addObject("title","ethnies");
		modelandview.addObject("userclicketnic",true);
		return modelandview;
	}
	
	
	@RequestMapping(value = "/show/all/hotels")
	public ModelAndView reservation() {
		ModelAndView modelandview=new ModelAndView("page");
		
		modelandview.addObject("title","reservation");
		
		modelandview.addObject("userclickreservation",true);
		
		modelandview.addObject("hotels",hotelDAO.listActiveHotels());
		
		modelandview.addObject("destinations",destinationDAO.listDestination());
		
		return modelandview;
	}
	
	
	
	@RequestMapping(value = "/show/destination/{id}/hotels")
	public ModelAndView HotelByDestination(@PathVariable("id") int id) {
		ModelAndView modelandview=new ModelAndView("page");
		Destination destination=null;
		 destination=destinationDAO.get(id);
		modelandview.addObject("title",destination.getDest_name());
		///Single get destination
		modelandview.addObject("destination",destination); 
		///all Destinations
		modelandview.addObject("destinations",destinationDAO.listDestination());
		
		///user clicks single Destination
		modelandview.addObject("userclickSingleDestination",true);
		
		modelandview.addObject("hotelbydestination",hotelDAO.listActiveHotelsbyDestination(id));
		
		return modelandview;
	}
	
	@RequestMapping(value="/show/{id}/singlehotel")
	public ModelAndView getSingleHotel(@PathVariable("id") int id) {
		ModelAndView modelandview=new ModelAndView("page");
		Hotel hotel=hotelDAO.get(id);
		modelandview.addObject("title",hotel.getName());
		
		modelandview.addObject("hotel",hotel);
		///user clicks single Hotel
		modelandview.addObject("userclickSingleHotel",true);
		/// actualiser le numero de views
		hotel.setViews(hotel.getViews() + 1);
		hotelDAO.updateHotel(hotel);
		return modelandview;
	}

}
