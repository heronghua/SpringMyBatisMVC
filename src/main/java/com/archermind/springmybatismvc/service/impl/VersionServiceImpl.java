package com.archermind.springmybatismvc.service.impl;

import com.archermind.springmybatismvc.dao.VersionMapper;
import com.archermind.springmybatismvc.service.UserService;
import com.archermind.springmybatismvc.service.VersionService;
import com.archermind.springmybatismvc.vo.User;
import com.archermind.springmybatismvc.vo.Version;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VersionServiceImpl implements VersionService {
	
	@Resource
	private VersionMapper versionMapper;
	
	@Override
	public Version getVersionByType(String type) {
		return versionMapper.selectByType(type);
	}
}
