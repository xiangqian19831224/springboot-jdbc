package com.example.jdbc.configuration;

import com.example.jdbc.dao.BookDao;
import com.example.jdbc.dao.impl.BookDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO: comment here
 */

@Configuration
public class Config {

	@Bean
	public BookDao bookDao(){
		return new BookDaoImpl();
	}
}
