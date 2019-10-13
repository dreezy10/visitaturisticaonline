package com.guinevisita.guinevisitaturisticabackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.guinevisita.guinevisitaturisticabackend.dao.DestinationDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Destination;

public class DestinationTestCase {
	
	
	private static AnnotationConfigApplicationContext context;
	private static DestinationDAO destinationDAO;
	
	
	private Destination destination;
	
	
	@BeforeClass
	public static void init() {
		
		context=new AnnotationConfigApplicationContext();
		context.scan("com.guinevisitaturistica.guinevisitabackend");
		context.refresh();
		
		destinationDAO=(DestinationDAO)context.getBean("destinationDAO");
		
	}
	

//	@Test
//	public void testAddDestination() {
//		
//		
//		destination=new Destination();
//		
//		destination.setDest_name("Bolama");
//		destination.setDest_address("Sud de la guinee-Bissau ");
//		destination.setDest_description("Bolama c'est la ville historique de la guinee-Bissau");
//		destination.setDest_imageUrl("Bolama01.png");
//		
//		assertEquals("la Destination est Bien ajouté dans la base des donnees",true,destinationDAO.addDestination(destination));
//	}
	

	
//	@Test
//	public void getTestDestination() {
//		destination=destinationDAO.get(3);
//		assertEquals("detination has been found","Bolama",destination.getDest_name());
//	}
//	
	
//	@Test
//	public void updateTestDestination() {
//		destination=destinationDAO.get(3);
//		
//		destination.setDest_name("Gabu");
//		destination.setDest_address("est de la Guinée Bissau");
//		destination.setDest_description("Gabu Sara un ville tres connue en Guinee Bissau. ");
//		destination.setDest_imageUrl("gabu01.png");
//		
//		assertEquals("la modification est bien fait",true,destinationDAO.update(destination));
//	}
	
	
	
//	@Test
//	public void deleteTestDestination() {
//		destination = destinationDAO.get(4);
//		assertEquals("detination has been found", true, destinationDAO.delete(destination));
//	}

//	@Test
//	public void listTestDestination() {
//
//		assertEquals("succefully fetch the destination list", 3, destinationDAO.listDestination().size());
//	}
	
	
	
	
	@Test 
	public void testCRUDOperation() {
		
		/*
		 * adding destination
		 * */
		
		destination=new Destination();

	    destination.setDest_name("Bissau");
		destination.setDest_address("secteur  Autonome 1000 BS");
	    destination.setDest_description("Bissau c'est la Capital de la Guinée-Bissau");
	    destination.setDest_imageUrl("Bissau.png");
	
	assertEquals("la Destination est Bien ajouté dans la base des donnees",true,destinationDAO.addDestination(destination));
	
	destination=new Destination();

    destination.setDest_name("Bo");
	destination.setDest_address("sud 10050 GW");
    destination.setDest_description("Bolama c'est la ville historique  de la Guinée-Bissau");
    destination.setDest_imageUrl("Bolama.png");

assertEquals("la Destination est Bien ajouté dans la base des donnees",true,destinationDAO.addDestination(destination));
		

			/*
			 * updating destination
			 * */

                destination=destinationDAO.get(2);
                destination.setDest_name("Bolama");
                assertEquals("la modification est bien fait",true,destinationDAO.update(destination));
                
                
               
                /*
    			 * deleting  destination
    			 * */
                
                destination = destinationDAO.get(2);
        		assertEquals("detination has been found", true, destinationDAO.delete(destination));
        		
        		
		
        		 /*
    			 * list of  destinations
    			 * 
    			 * 
    			 * */
        		
        		
        		assertEquals("succefully fetch the destination list", 1, destinationDAO.listDestination().size());
	}
	
}
