package com.jlc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlc.bean.EntPolicy;
import com.jlc.bean.PageEntity;
import com.jlc.bean.PageOL;
import com.jlc.dao.EntPolicyDao;
import com.jlc.service.EntPolicyService;

@Service("EntPolicyService")
public class EntPolicyServiceImpl implements EntPolicyService{
	@Autowired
	private EntPolicyDao entPolicyDao;
	
	public int createEntPolicy(EntPolicy entPolicy) throws Exception {
		return entPolicyDao.createEntPolicy(entPolicy);
	}

	public List<EntPolicy> getEntPolicyInfo(EntPolicy entPolicy,PageEntity page)
			throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("e", entPolicy);
		PageOL pageOL=new PageOL();
		pageOL.setOffsetPara((page.getCurrentPage() - 1) * page.getPageSize());
	    pageOL.setLimitPara(page.getPageSize());
	    map.put("page", pageOL);
		return entPolicyDao.getEntPolicyInfo(map);
	}

	public EntPolicy getEntPolicyInfoById(int entPolicyId) throws Exception {
		return entPolicyDao.getEntPolicyInfoById(entPolicyId);
	}

	public void deleteEntPolicy(List<Integer> policyList) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("policyList",policyList );
		entPolicyDao.deleteEntPolicy(map);
	}

}
