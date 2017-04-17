package com.jlc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jlc.base.action.BaseAction;
import com.jlc.bean.User;
import com.jlc.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserAction extends BaseAction {

	@Autowired
	private UserService userService;

	/**
	 *  Function:跳转到成功页面
	 *  http://localhost:8080/springmvc/user/login
	 *  @author djl
	 *  @return
	 */
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, Model model) {
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		System.out.println(account);
		System.out.println(password);
		int a = userService.getUserInfo(account, password);
		System.out.println(a);
		if (a == 1) {
			return "user/fail";
		} else {
			return "redirect:/user/userlist";
		}
	}

	/**
	 *  Function:返回JSON数据
	 *  http://localhost:8080/springmvc/user/json
	 *  @author djl
	 *  @return
	 */
	@RequestMapping(value = "/json", method = RequestMethod.GET)
	@ResponseBody
	public List<User> test() {
		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setId(1L);
		user.setName("name1");
		user.setPassword("中文");
		userList.add(user);
		user = new User();
		user.setId(2L);
		user.setName("name2");
		user.setPassword("password");
		userList.add(user);
		user = new User();
		user.setId(3L);
		user.setName("name3");
		user.setPassword("password");
		userList.add(user);
		return userList;
	}

	/**
	 *  Function:添加
	 *  http://localhost:8080/springmvc/user/add?username=test
	 *  @author JNC
	 *  @param name
	 *  @return
	 */
	@RequestMapping(value = "/add")
	public ModelAndView add(@RequestParam(value = "username", required = true, defaultValue = "jnc")
	String name) {
		//@RequestParam(value="username", required=true, defaultValue="jnc"
		//验证username  为空时，默认值为jnc
		System.out.println(name);
		ModelAndView mv = new ModelAndView("user/success");
		mv.addObject("add", "添加");
		return mv;

	}

	/**
	 *  Function:列表参数
	 *  http://localhost:8080/springmvc/user/list?ids=1&ids=2&ids=3
	 *  @author JNC
	 *  @param name
	 *  @return
	 */
	@RequestMapping(value = "/list")
	public String list(@RequestParam(value = "ids")
	List<String> ids) {
		System.out.println(ids);
		return "user/success";
	}

	/**
	 *  Function:动态url
	 *  http://localhost:8080/springmvc/user/{userId}/article/{articleId}
	 *  @author djl
	 *  @param userId
	 *  @param articleId
	 *  @return
	 */
	@RequestMapping(value = "/{userId}/article/{articleId}")
	public String article(@PathVariable(value = "userId")
	int userId, @PathVariable(value = "articleId")
	int articleId) {
		System.out.println(userId);
		System.out.println(articleId);
		return "user/success";
	}

	/**
	 *  Function:表单提交用户信息
	 *  http://localhost:8080/springmvc/user/userset
	 *  @author djl
	 *  @param user
	 *  @return
	 */
	@RequestMapping(value = "/userset", method = RequestMethod.POST)
	public String user(@ModelAttribute("user")
	User user) {
		System.out.println(user.getName());
		return "user/success";
	}

	/**
	 *  取得用户列表
	 *  @author djl
	 *  @return
	 *  @throws Exception
	 */
	@RequestMapping(value = "/userlist")
	public ModelAndView getUser() throws Exception {

		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("userlist", userService.getUsers());
		return mv;
	}

	/**
	 *  保存用户
	 *  @author djl
	 *  @return
	 *  @throws Exception
	 */
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user")
	User userInfo) throws Exception {
		userService.saveUser(userInfo);
		return "redirect:/user/userlist";
	}

	/**
	 *  Function:修改用户
	 *  @author  djl
	 *  @return
	 *  @throws Exception
	 */
	@RequestMapping(value = "/edituser", method = RequestMethod.GET)
	public ModelAndView editUser(@ModelAttribute("user")
	User userInfo) throws Exception {
		ModelAndView mv = new ModelAndView("user/edit");
		mv.addObject("users", userService.getUserInfo(userInfo));
		return mv;
	}

	/**
	 *  删除用户
	 *  @author djl
	 *  @return
	 *  @throws Exception 
	 */
	@RequestMapping(value = "/deluser", method = RequestMethod.GET)
	public String deleteUser(@ModelAttribute("user")
	User userInfo) throws Exception {
		if (userInfo != null && userInfo.getId() != null) {
			userService.deleteUser(userInfo.getId());
		}
		return "redirect:/user/userlist";
	}
}
