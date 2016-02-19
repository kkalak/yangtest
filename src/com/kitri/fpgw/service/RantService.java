package com.kitri.fpgw.service;

import com.kitri.fpgw.model.RantMainDto;

public interface RantService {
	public void reserve(RantMainDto rantMainDto) throws Exception;
}
