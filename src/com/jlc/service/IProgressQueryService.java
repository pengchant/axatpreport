package com.jlc.service;

import com.jlc.util.PagedResult;
import com.jlc.views.PolicyClaimProgressView;

/**
 * 团车报案进度查询
 * 
 * @author cp
 * 
 */
public interface IProgressQueryService {

	/**
	 * 查询理赔进度
	 * @param pageNo		页号
	 * @param pageSize		页面大小
	 * @param licensePlage	车牌号
	 * @param insuredName	姓名
	 * @param caseProgress	进度
	 * @param entid			企业id
	 * @return				分页后的数据
	 */
	PagedResult<PolicyClaimProgressView> queryProgress(Integer pageNo,Integer pageSize,String licensePlage,
			String insuredName, String caseProgress,String entId);
}
