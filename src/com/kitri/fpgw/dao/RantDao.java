package com.kitri.fpgw.dao;

import com.kitri.fpgw.model.RantMainDto;

public interface RantDao {

	public void reserve(RantMainDto rantMainDto) throws Exception;
	
}
