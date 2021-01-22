package com.lhn.formssi.service;

import com.lhn.formssi.entity.User;

public interface UserService {
	//用户登录验证
    public User loginCheck(User user) throws Exception;
    
    //用户登录验证
  	public int register(User user) throws Exception;
}
