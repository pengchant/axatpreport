package com.jlc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlc.bean.User;
import com.jlc.dao.UserDao;
import com.jlc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getUsers() {

		return userDao.getUser();
	}

	public User getUserInfo(User user) throws Exception {
		return userDao.getUser(user);
	}

	public void saveUser(User user) throws Exception {
		if (user != null && user.getId() != null) {
			userDao.updateUser(user);
		} else {
			userDao.insertUser(user);
		}
	}

	public int deleteUser(Long id) throws Exception {
		return userDao.deleteUser(id);
	}

	public int getUserInfo(String account, String password) {
		System.out.println("account:" + account + ",password" + password);
		try{
			User user = userDao.getUserByCount(account);
			System.out.println("p:"+user.getPassword());
				if (user == null) {
					return 1;
				} else if (!password.equals(user.getPassword())) {
					return 1;
				} else {
					return 2;
				}
		}catch(Exception e) {
			e.printStackTrace();
			return 2;
		} 
		
	}
}
