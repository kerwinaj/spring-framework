package com.xyzsoft.circle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {
	@Autowired
	Y y;

	public X() {
		System.out.println("X is created");
	}
}
