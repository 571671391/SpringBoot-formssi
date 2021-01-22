package com.lhn.formssi.service;

import com.lhn.formssi.entity.Customer;

public interface CustomerService {
	//录入问卷成绩
	public int addCustomer(Customer customer) throws Exception;
	
	//根据关键字查询customer
	public Customer queryCustomer(String keywordType, String keyword) throws Exception;
}
