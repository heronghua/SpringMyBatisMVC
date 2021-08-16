package com.archermind.springmybatismvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.archermind.springmybatismvc.dao.UserMapper;
import com.archermind.springmybatismvc.service.UserService;
import com.archermind.springmybatismvc.vo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public User getUserByNu(int nu) {
		return userMapper.selectByPrimaryKey(nu);
	}

	@Override
	public boolean register() {
		return false;
	}

}
