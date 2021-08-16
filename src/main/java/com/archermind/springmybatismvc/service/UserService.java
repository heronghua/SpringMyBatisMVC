package com.archermind.springmybatismvc.service;

import com.archermind.springmybatismvc.vo.User;

public interface UserService {
	
	User getUserByNu(int nu);

	boolean register();
}
