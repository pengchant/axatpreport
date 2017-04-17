/*
 * File name:          MyBatisTest.java
 * Copyright@Handkoo (China)
 * Editor:           JDK1.6.32
 */
package test;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:           djl
 * <p>
 * Date:           Mar 12, 2015
 * <p>
 * Time:           9:53:04 AM
 * <p>
 * Director:        djl
 * <p>
 * <p>
 */

import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.jlc.bean.User;
import com.jlc.service.UserService;

/** 
 * myBatis数据库连接测试 
 *  
 * @author db2admin 
 *  
 */
public class MyBatisTest {
	@Test
	public void userDaoTest() throws Exception {
		String resource = "spring-context.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(reader);

		SqlSession session = factory.openSession();
		UserService userService = session.getMapper(UserService.class);

		User user = new User();
		user.setName("dddd");
		user.setPassword("123213");
		user.setAccount("cccc");

		userService.saveUser(user);

		List<User> users = userService.getUsers();
		Iterator<User> iter = users.iterator();
		while (iter.hasNext()) {
			User u = iter.next();
			System.out.println("用户名：" + u.getName() + "密码：" + u.getPassword());
		}

		user.setName("comment");
		userService.saveUser(user);

		userService.deleteUser(5L);

		session.commit();
		session.close();
	}
}
