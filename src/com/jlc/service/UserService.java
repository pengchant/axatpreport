package com.jlc.service;

import java.util.List;

import com.jlc.bean.User;

public interface UserService {
	/**
	 *  取得所有用户
	 *  @author DJL
	 *  @return 用户列表
	 */
	public List<User> getUsers() throws Exception;

	/**
	 *  取得用户信息
	 *  @author DJL
	 *  @return User对象
	 *  @throws Exception
	 */
	public User getUserInfo(User user) throws Exception;

	/**
	 *  保存用户
	 *  @author DJL
	 *  @param user
	 *  @return
	 *  @throws Exception
	 */
	public void saveUser(User user) throws Exception;

	/**
	 *  删除用户
	 *  @author DJL
	 *  @param id
	 *  @return
	 */
	public int deleteUser(Long id) throws Exception;

	/**
	 *  取得特定用户的信息
	 *  @author DJL
	 *  @param name
	 *  @return
	 */
	public int getUserInfo(String account, String password);

}
