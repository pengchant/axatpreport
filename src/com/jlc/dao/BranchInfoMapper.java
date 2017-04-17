package com.jlc.dao;

import com.jlc.bean.BranchInfo;

public interface BranchInfoMapper {
    int deleteByPrimaryKey(Integer branchId);

    int insert(BranchInfo record);

    int insertSelective(BranchInfo record);

    BranchInfo selectByPrimaryKey(Integer branchId);

    int updateByPrimaryKeySelective(BranchInfo record);

    int updateByPrimaryKey(BranchInfo record);
}