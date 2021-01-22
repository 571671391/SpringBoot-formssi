package com.lhn.formssi.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhn.formssi.entity.User;
import com.lhn.formssi.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/login")
	public Map<String, Object> staffLogin(@RequestBody User user, HttpSession session)
	{
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			modelMap.put("success", userService.loginCheck(user));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("userName", user.getUserName());
		return modelMap;
	}
	
	@PostMapping(value = "/register")
	public Map<String, Object> register(@RequestBody User user)
	{
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			modelMap.put("success", userService.register(user));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modelMap;
	}
}
