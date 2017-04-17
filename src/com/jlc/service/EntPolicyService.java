package com.jlc.service;

import java.util.List;
import java.util.Map;

import com.jlc.bean.EntPolicy;
import com.jlc.bean.PageEntity;

public interface EntPolicyService {
public int createEntPolicy(EntPolicy entPolicy) throws Exception;
	
	public List<EntPolicy> getEntPolicyInfo(EntPolicy entPolicy,PageEntity page) throws Exception;
	
	public void deleteEntPolicy(List<Integer> policyList) throws Exception;
	
	public EntPolicy getEntPolicyInfoById(int entPolicyId) throws Exception;
}
