package com.lhn.formssi.service.impl;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhn.formssi.dao.CustomerDao;
import com.lhn.formssi.entity.Customer;
import com.lhn.formssi.service.CustomerService;
import com.lhn.formssi.util.JsonUtil;

import net.sf.json.JSONArray;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;
	@Override
	public int addCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		String answers = customer.getAnswer();
		JSONArray answerArray = JSONArray.fromObject(answers);
		JSONArray first = answerArray.getJSONArray(0);
		if(first.getInt(0) == 0) {
			customer.setGrade("0");
		}else if(first.getInt(0) == 10 && answerArray.getInt(1) == 2) {
			customer.setGrade("1");
		}else {
			int grade = 0;
			for(int i = 0; i < answerArray.size(); i++) {
				if(i == 0) {
					grade = grade + first.getInt(0);
				}else if(i != 0 && JsonUtil.isJsonArray(answerArray, i)){
					JSONArray array = answerArray.getJSONArray(i);
					for(int j = 0; j < array.size(); j++) {
						grade = grade + array.getInt(j);
					}
				}else {
					grade = grade + answerArray.getInt(i);
				}
			}
			if(grade <= 30) {
				customer.setGrade("0");
			}else if(grade > 30 && grade <= 50) {
				customer.setGrade("1");
			}else if(grade > 50 && grade <= 70) {
				customer.setGrade("2");
			}else if(grade > 70 && grade <= 90) {
				customer.setGrade("3");
			}else {
				customer.setGrade("4");
			}
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		customer.setAnswerTime(df.format(calendar.getTime()));
		calendar.add(Calendar.YEAR, 1);
		customer.setDueDate(df.format(calendar.getTime()));
		return customerDao.addCustomer(customer);
	}
	
	@Override
	public Customer queryCustomer(String keywordType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return customerDao.queryCustomer(keywordType, keyword);
	}

}
