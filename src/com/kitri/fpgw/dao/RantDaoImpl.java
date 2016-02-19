package com.kitri.fpgw.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kitri.fpgw.model.RantMainDto;

@Repository
public class RantDaoImpl implements RantDao {
	
	@Autowired
	private SqlSessionTemplate SqlSessionTemplate;
	
	@Override
	public void reserve(RantMainDto rantMainDto) throws Exception {
		// TODO Auto-generated method stub
		SqlSessionTemplate.insert("InsertReserve");
	}

}
