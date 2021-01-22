package com.lhn.formssi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhn.formssi.dao.UserDao;
import com.lhn.formssi.entity.User;
import com.lhn.formssi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public User loginCheck(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.loginCheck(user);
	}

	@Override
	public int register(User user) throws Exception {
		// TODO Auto-generated method stub
		String str = user.getIdCard();
		String userNumber = "001" + str.substring(str.length() - 7, str.length());
		user.setUserNumber(userNumber);
		return userDao.register(user);
	}

}
