package com.example.jdbc.dao.impl;

import com.example.jdbc.dao.BookDao;
import com.example.jdbc.entity.Book;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * TODO: comment here
 */
public class BookDaoImpl implements BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Book> readALLBook() {
		StringBuilder sb = new StringBuilder();
		sb.append("select * from sh_book");
		String sql = sb.toString();
		List<Book> books = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(Book.class));

		return books;
	}
}
