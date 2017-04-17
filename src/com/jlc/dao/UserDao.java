package com.jlc.dao;

import java.util.List;

import com.jlc.bean.User;

public interface UserDao {
	/**
	 *  取得所有用户
	 *  @author DJL
	 *  @return 用户列表
	 */
	public List<User> getUser();

	/**
	 *  取得指定用户帐号的用户信息
	 *  @author DJL
	 *  @return 用户列表
	 */
	public User getUserByCount(String account);

	/**
	 *  根据用户账号信息取得用户
	 *  @author DJL
	 *  @return
	 */
	public User getUser(User user);

	/**
	 *  添加用户
	 *  @author DJL
	 *  @param user
	 *  @return
	 */
	public void insertUser(User user);

	/**
	 *  更新用户信息
	 *  @author DJL
	 *  @param user
	 *  @return
	 */
	public int updateUser(User user);

	/**
	 *  删除用户
	 *  @author DJL
	 *  @param id
	 *  @return
	 */
	public int deleteUser(Long id);

}
