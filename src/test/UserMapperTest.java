package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jlc.bean.User;
import com.jlc.service.UserService;

public class UserMapperTest {

	private static ApplicationContext ctx;

	@BeforeClass
	public static void beforeClass() {
		ctx = new ClassPathXmlApplicationContext("spring-context.xml");
	}

	@AfterClass
	public static void afterClass() {
		ctx = null;
	}

	@Test
	public void testAddUser() throws Exception {
		User user = new User();
		user.setPassword("123213");
		user.setAccount("cccc");
		UserService userService = ctx.getBean(UserService.class);

		userService.saveUser(user);

	}

	public static void main(String[] args) throws Exception {
		beforeClass();
		new UserMapperTest().testAddUser();
		afterClass();
	}

}