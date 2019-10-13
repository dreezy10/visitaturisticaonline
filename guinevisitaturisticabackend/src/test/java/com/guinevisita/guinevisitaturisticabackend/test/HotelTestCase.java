package com.guinevisita.guinevisitaturisticabackend.test;


import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.guinevisita.guinevisitaturisticabackend.dao.HotelDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Hotel;

public class HotelTestCase {


	private static AnnotationConfigApplicationContext context;
	private static HotelDAO hotelDAO;
	
	
	private  Hotel hotel;
	
	
	@BeforeClass
	public static void init() {
		
		context=new AnnotationConfigApplicationContext();
		context.scan("com.guinevisitaturistica.guinevisitabackend");
		context.refresh();
		
		hotelDAO=(HotelDAO)context.getBean("hotelDAO");
		
	}
//	
//	@Test
//	public void testCreate() {
//	
//		 /* Create*/
//		
//		hotel=new Hotel();
//		hotel.setDestination_id(1);
//		hotel.setCoordination_id(1);
//		hotel.setCode(new String[]{"HA4455230","HA293334sddd4549433594545","HA398920405","HA3450009786"});
//		hotel.setName("Hotel Trinton");
//		hotel.setAddress("Avenida Francisco Mendees, C.P. 1001 Bissau");
//		hotel.setDescription("avec son view encroyable, Hotel Azalai a des differents suits pour votre sejour");
//		hotel.setIs_active(true);
//		hotel.setPrice(52000);
//		
//		assertEquals("Impossible de ajouter l'hotel sur la base des donnees", true,hotelDAO.addHotel(hotel));
//
//	}
		
		

		
//	@Test
//	public void testGet() {
//		
//		/**
//		 * Retrieve
//		 * */
//			hotel=hotelDAO.get(5);
//		assertEquals("Impossible de trouver l'hotel", "Hotel Trinton",hotelDAO.updateHotel(hotel));
//	}
//    	
//  
//    	
//    	
//       
//	@Test
//	public void testDelete() {
//		/* delete*/
//
//		hotel=hotelDAO.get(5);
//	assertEquals("Impossible de supprimer l'hotel", true,hotelDAO.deleteHotel(hotel));
//		
//	}
//    	
//	@Test
//	public void testarray() {
//	hotel=hotelDAO.get(5);
//	assertArrayEquals(new String[]{"HA4455230","HA293349595","HA398920405","HA3450009786"}, hotel.getCode());
//	}
//	
	
//	@Test
//	public void testList() {
//		
//		/**
//		 * list 
//		 * 
//		 * */
//		assertEquals("Impossible de lister  les hotels",2,hotelDAO.listActiveHotels().size());
//		
//	}


}
