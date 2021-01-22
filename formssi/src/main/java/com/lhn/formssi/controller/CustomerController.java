package com.lhn.formssi.controller;

import java.util.HashMap;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhn.formssi.entity.Customer;
import com.lhn.formssi.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
@CrossOrigin
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping(value = "/addCustomer")
	public Map<String, Object> addCustomer(@RequestBody Customer customer){
		Map<String, Object> mapModel = new HashMap<String, Object>();
		try {
			mapModel.put("success", customerService.addCustomer(customer));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapModel;
	}
	
	@PostMapping(value = "/queryCustomer")
	public Map<String, Object> queryCustomer(String keywordType, String keyword){
		Map<String, Object> mapModel = new HashMap<String, Object>();
		try {
			mapModel.put("success", customerService.queryCustomer(keywordType, keyword));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapModel;
	}
}
