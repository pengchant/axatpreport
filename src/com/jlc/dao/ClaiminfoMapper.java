package com.jlc.dao;

import com.jlc.bean.Claiminfo;

public interface ClaiminfoMapper {
    int deleteByPrimaryKey(Integer caseId);

    int insert(Claiminfo record);

    int insertSelective(Claiminfo record);

    Claiminfo selectByPrimaryKey(Integer caseId);

    int updateByPrimaryKeySelective(Claiminfo record);

    int updateByPrimaryKey(Claiminfo record);
}