package com.jlc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jlc.bean.Entpolicyclaim;
import com.jlc.views.PolicyClaimProgressView;

public interface EntpolicyclaimMapper {
    int deleteByPrimaryKey(Integer claimId);

    int insert(Entpolicyclaim record);

    int insertSelective(Entpolicyclaim record);

    Entpolicyclaim selectByPrimaryKey(Integer claimId);

    int updateByPrimaryKeySelective(Entpolicyclaim record);

    int updateByPrimaryKey(Entpolicyclaim record);
    
    // 查询理赔进度
    List<PolicyClaimProgressView> queryProgress(
    		@Param("licensePlate")String licensePlage,
    		@Param("insuredName")String insuredName,
    		@Param("caseProgress")String caseProgress,
    		@Param("entId")String entId);
}