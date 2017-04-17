package com.jlc.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlc.bean.EnterPrise;
import com.jlc.dao.EnterPriseDao;
import com.jlc.service.EnterPriseService;

@Service("EnterPriseService")
public class EnterPriseServiceImpl implements EnterPriseService{
	@Autowired
	private EnterPriseDao enterPriseDao;
	
	public EnterPrise getLoginEnt(String entCode,String password) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("username", entCode);
		map.put("password", password);
		return enterPriseDao.getLoginEnt(map);
	}

}
