package com.jlc.service;

import com.jlc.bean.EnterPrise;

public interface EnterPriseService {
	/**
	 * 合作企业登录
	 * @return 合作企业的信息
	 * @throws Exception
	 */
	public EnterPrise getLoginEnt(String entCode,String password) throws Exception;
}
