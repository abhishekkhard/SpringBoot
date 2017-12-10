package com.example.khard.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.khard.dao.MyInfoDAO;

@Repository
public class MyInfoDAOImpl implements MyInfoDAO{

	
	@Override
	public String fetchName() {
		// TODO Auto-generated method stub
		return "Abhikhard...";
	}

}
