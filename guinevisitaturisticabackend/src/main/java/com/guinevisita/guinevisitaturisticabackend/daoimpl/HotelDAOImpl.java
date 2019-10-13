package com.guinevisita.guinevisitaturisticabackend.daoimpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.guinevisita.guinevisitaturisticabackend.dao.HotelDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Hotel;

@Repository("hotelDAO")
@Transactional
public class HotelDAOImpl implements HotelDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Hotel> list() {
		// TODO Auto-generated method stub
		String selectHotel="FROM Hotel";
		Query query = sessionFactory.getCurrentSession().createQuery(selectHotel);
		
		
		return query.getResultList();
	}


	@Override
	public Hotel get(int hotelId) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Hotel.class, Integer.valueOf(hotelId));
	}


	@Override
	public boolean addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().persist(hotel);

			return true;

		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}


	@Override
	public boolean updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(hotel);
			
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}


	@Override
	public boolean deleteHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		try {
			hotel.setIs_active(false);
			sessionFactory.getCurrentSession().update(hotel);
			
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}


	@Override
	public List<Hotel> listActiveHotels() {
		// TODO Auto-generated method stub
		
		String selectActeveHotels="FROM Hotel WHERE is_active=:is_active";
		
		return sessionFactory.getCurrentSession().createQuery(selectActeveHotels,Hotel.class)
				.setParameter("is_active", true).getResultList()
				;
	}


	@Override
	public List<Hotel> getLatestActiveHotels(int count) {
		// TODO Auto-generated method stub
String latestActiveHotels="FROM Hotel WHERE is_active=:is_active ORDER BY id";
		
		return sessionFactory.getCurrentSession().createQuery(latestActiveHotels,Hotel.class)
				.setParameter("is_active", true).
				setFirstResult(0)
				.setMaxResults(count).
				getResultList()
				;
	}


	@Override
	public List<Hotel> listActiveHotelsbyDestination(int destination_id) {
		// TODO Auto-generated method stub
String selectlistActiveHotelsbyDestination="FROM Hotel WHERE is_active=:is_active AND destination_id=:destination_id";
		
		return sessionFactory.getCurrentSession().createQuery(selectlistActiveHotelsbyDestination,Hotel.class)
				.setParameter("is_active", true).
				setParameter("destination_id",destination_id).
				getResultList()
				;
	}
		
}
