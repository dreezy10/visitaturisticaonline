package com.guinevisita.guinevisitaturisticabackend.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.guinevisita.guinevisitaturisticabackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
	
	///fields
	private static final String DATABASE_URL="jdbc:h2:tcp://localhost/~/guinevisita";
	private static final String DATABASE_DRIVER="org.h2.Driver";
	private static final String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private static final String DATABASE_USERNAME="guinevisita";
	private static final String DATABASE_PASSWORD="guinevisita";
	

	
	/***
	 * Datasource Method
	 * **/
	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource= new BasicDataSource();
		
		
		///Database connection info////
		dataSource.setUrl(DATABASE_URL);
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		
		return dataSource;
	}
	
	
	/**
	 * SessionFactory Method
	 * 
	 * **/
	
	
	
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
	
		LocalSessionFactoryBuilder sessionBuilder= new LocalSessionFactoryBuilder(dataSource);
		
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.scanPackages("com.guinevisita.guinevisitaturisticabackend.dto");
		
		return sessionBuilder.buildSessionFactory();
		
		
		
	}

	/**
	 * Hibernate Properties
	 * */
	public Properties getHibernateProperties() {
		Properties properties= new Properties();
		properties.put("hibernate.Dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		
		return properties;
	}
	
	
	/**
	 * 
	 * TransactionManager Method
	 * **/
	@Bean
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		
		return transactionManager;
	}

}
