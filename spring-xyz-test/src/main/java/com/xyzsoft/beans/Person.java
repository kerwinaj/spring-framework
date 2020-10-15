package com.xyzsoft.beans;

public class Person {
	private Integer id;
	private String name;

	public Person() {
		System.out.println("[Person.init]coming");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("[Person.setName]coming, name:"+name);
		this.name = name;
		System.out.println("[Person.setName]end, name:"+name);
	}

	public void initMethod(){
		System.out.println("[Person.initMethod]coming, name:"+name);
	}
}
