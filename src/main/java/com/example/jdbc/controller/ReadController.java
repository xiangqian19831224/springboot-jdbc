package com.example.jdbc.controller;

import com.example.jdbc.dao.BookDao;
import com.example.jdbc.entity.Book;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO: comment here
 */
@RestController
public class ReadController {
	private Gson gson = new Gson();

	@Autowired
	BookDao bookDao;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getBookList(@RequestParam("command") String cmd){
		if(!cmd.equals("select")){
			return "want command=select?";
		}

		List<Book> books = bookDao.readALLBook();

		String bookStr = gson.toJson(books);

		return bookStr;
	}
}
