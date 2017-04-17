package com.jlc.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jlc.bean.Entpolicyclaim;
import com.jlc.bean.User;
import com.jlc.dao.EntPolicyDao;
import com.jlc.dao.EntpolicyclaimMapper;
import com.jlc.service.IProgressQueryService;
import com.jlc.util.BeanUtil;
import com.jlc.util.PagedResult;
import com.jlc.views.PolicyClaimProgressView;

/**
 * 查询案件进度的服务
 * @author cp
 *
 */
@Service
public class ProgressQueryService implements IProgressQueryService {

	private static final Logger logger = LoggerFactory.getLogger(ProgressQueryService.class);
	
	/**
	 * 案件查询的数据库访问器
	 */
	@Resource
	private EntpolicyclaimMapper entPolicyClaimDao;
	
	/**
	 * 查询进度
	 */
	public PagedResult<PolicyClaimProgressView> queryProgress(Integer pageNo,
			Integer pageSize, String licensePlage, String insuredName,
			String caseProgress,String endId) {
		PagedResult<PolicyClaimProgressView> pagedUseResult = null; 
		pageNo = pageNo == null ? 0 : pageNo; 
		pageSize = pageSize == null ? 10 : pageSize; 
		PageHelper.startPage(pageNo, pageSize); 
	    try {
	    	// 返回pagedBean对象
			pagedUseResult =  BeanUtil.topagedResult(entPolicyClaimDao.queryProgress(licensePlage, insuredName, caseProgress,endId));		 
		} catch (Exception e) {			 
			e.printStackTrace();
		}
	    return pagedUseResult;  
	} 
}
