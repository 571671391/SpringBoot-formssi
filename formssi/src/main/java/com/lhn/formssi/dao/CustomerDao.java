package com.lhn.formssi.dao;

import org.apache.ibatis.annotations.Param;

import com.lhn.formssi.entity.Customer;

public interface CustomerDao {
	//录入问卷成绩
	public int addCustomer(Customer customer) throws Exception;
	
	//根据关键字查询问卷信息
	public Customer queryCustomer(@Param("keywordType") String keywordType, @Param("keyword") String keyword) throws Exception;
}
