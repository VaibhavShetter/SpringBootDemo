package com.vaibhavshetter.dao;

public class UserDaoImpl {

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		
		System.out.println("*********UserDaoImpl :: Constructor ******");
	}
	public String findNameById(Integer id) {
		if (id == 101) {
			return "John";
		} else if (id == 102) {
			return "Smith";
		} else {
			return null;
		}
	}

}
