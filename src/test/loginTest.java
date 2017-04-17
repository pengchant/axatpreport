/*
 * File name:          loginTest.java
 * Copyright@Handkoo (China)
 * Editor:           JDK1.6.32
 */
package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jlc.service.UserService;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:           djl
 * <p>
 * Date:           Mar 12, 2015
 * <p>
 * Time:           1:50:30 PM
 * <p>
 * Director:        djl
 * <p>
 * <p>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
public class loginTest {
	@Autowired
	private UserService userService;

	@Test
	public void login() throws Exception {
		// User user = new User(null, "wx", "123456", new Date());
		// User user = new User(null, "wangxin", "123456", new Date());
		// User loginExit = userMapper.login(user);
		// User loginExit = userMapper.login("wx", "123456");
		int a = userService.getUserInfo("djl", "1234");
		if (a == 1) {
			System.out.println("登录失败");
		} else {
			System.out.println(a);
			System.out.println("登录成功！");
		}
	}
}
