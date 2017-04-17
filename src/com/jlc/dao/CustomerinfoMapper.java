package com.jlc.dao;

import com.jlc.bean.Customerinfo;

public interface CustomerinfoMapper {
    int deleteByPrimaryKey(Integer customerid);

    int insert(Customerinfo record);

    int insertSelective(Customerinfo record);

    Customerinfo selectByPrimaryKey(Integer customerid);

    int updateByPrimaryKeySelective(Customerinfo record);

    int updateByPrimaryKey(Customerinfo record);
}