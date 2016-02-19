package com.kitri.fpgw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitri.fpgw.dao.RantDao;
import com.kitri.fpgw.model.RantMainDto;

@Service
public class RantServiceImpl implements RantService {
	
	@Autowired
	private RantDao RentDao;
	
	@Override
	public void reserve(RantMainDto rantMainDto) throws Exception {
		// TODO Auto-generated method stub
		RentDao.reserve(rantMainDto);
	}

}
