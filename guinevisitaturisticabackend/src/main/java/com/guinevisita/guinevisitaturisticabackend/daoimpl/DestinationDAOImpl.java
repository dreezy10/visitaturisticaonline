package com.guinevisita.guinevisitaturisticabackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.guinevisita.guinevisitaturisticabackend.dao.DestinationDAO;
import com.guinevisita.guinevisitaturisticabackend.dto.Destination;

@Repository("destinationDAO")
@Transactional
public class DestinationDAOImpl implements DestinationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Destination> destinations = new ArrayList<>();

	@Override
	public List<Destination> listDestination() {
		
		String selectDestination="FROM Destination";
		Query query = sessionFactory.getCurrentSession().createQuery(selectDestination);
		
		
		return query.getResultList();
		
	}

	
	/**
	 * get one destination by id
	 * **/
	@Override
	public Destination get(int id) {
		/// For Loop

		return sessionFactory.getCurrentSession().get(Destination.class, Integer.valueOf(id));
	}

	@Override

	public boolean addDestination(Destination destination) {
		// TODO Auto-generated method stub

		try {
			sessionFactory.getCurrentSession().persist(destination);

			return true;

		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}

	}

	@Override
	public boolean update(Destination destination) {
		try {
			sessionFactory.getCurrentSession().update(destination);
			
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}

	}

	@Override
	public boolean delete(Destination destination) {
		
		try {
			sessionFactory.getCurrentSession().delete(destination);
			
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}

	}

}
