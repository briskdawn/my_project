package service.impl;

import java.util.List;

import mapper.UserMapper;
import pojo.User;
import service.UserService;

public class UserImpl implements UserService {
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> show() {
		
		return userMapper.selAll();
	}

}
