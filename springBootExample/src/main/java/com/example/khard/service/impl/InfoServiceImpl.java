/**
 * 
 */
package com.example.khard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.khard.dao.MyInfoDAO;
import com.example.khard.service.InfoService;

/**
 * Created by abhik
 * on 21-Jul-2017
 */
@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	public MyInfoDAO myInfoDAO;

	@Override
	public String fetchName() {
		// TODO Auto-generated method stub
		return myInfoDAO.fetchName();
	}

}
