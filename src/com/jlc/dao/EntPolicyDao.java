package com.jlc.dao;

import java.util.List;
import java.util.Map;

import com.jlc.bean.EntPolicy;

public interface EntPolicyDao {
	public int createEntPolicy(EntPolicy entPolicy);
	
	public List<EntPolicy> getEntPolicyInfo(Map<String, Object> map);
	
	public void deleteEntPolicy(Map<String, Object> map);
	
	public EntPolicy getEntPolicyInfoById(int entPolicyId);
}
