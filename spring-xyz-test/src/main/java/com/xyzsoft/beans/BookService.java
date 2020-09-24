package com.xyzsoft.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;

	public void testInBookService(){
		bookDao.testInBookDao();
	}
}
