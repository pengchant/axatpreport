package com.jlc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.jlc.bean.User;
import com.jlc.service.UserService;
import com.jlc.service.impl.UserServiceImpl;
import com.jlc.util.BeanUtil;
import com.jlc.util.PagedResult;

/**
 * 测试控制器
 * @author cp
 *
 */
@Controller
@Scope("prototype")
public class TestContorller {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 分页查询用户的信息
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/getPagedResult")
	@ResponseBody
	public PagedResult<User> getPagedResult(Integer pageNo,Integer pageSize){	
		PagedResult<User> pagedUseResult = null;
		// 页号
		pageNo = pageNo == null ? 0 : pageNo;
		// 页面大小
		pageSize = pageSize == null ? 10 : pageSize;
		// 设置页号和大小
		PageHelper.startPage(pageNo, pageSize); 
	    try {
	    	// 返回pagedBean对象
			pagedUseResult =  BeanUtil.topagedResult(userService.getUsers());		 
		} catch (Exception e) {			 
			e.printStackTrace();
		}
	    return pagedUseResult;
	}
}
