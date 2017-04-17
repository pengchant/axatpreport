package com.jlc.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jlc.bean.EntPolicy;
import com.jlc.bean.EnterPrise;
import com.jlc.bean.PageEntity;
import com.jlc.service.EntPolicyService;
import com.jlc.service.EnterPriseService;
import com.jlc.service.IProgressQueryService;
import com.jlc.service.impl.ProgressQueryService;
import com.jlc.util.PagedResult;
import com.jlc.views.PolicyClaimProgressView;

/**
 * 主要的控制器
 * @author cp
 *
 */
@Controller
@Scope(value="prototype")
public class ServerController {
	
	private static final Logger logger = LoggerFactory.getLogger(ServerController.class);
	
	@Autowired
	private IProgressQueryService progressQueryService;
	
	@Autowired
	private EnterPriseService enterPriseService;
	@Autowired
	private EntPolicyService entPolicyService;
	
	@InitBinder({ "policy" })
	public void initUser(WebDataBinder dinder) {
		dinder.setFieldDefaultPrefix("policy.");
	}
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	/**
	 * 进入后台主页面(默认显示信息管理)
	 * @return
	 */
	@RequestMapping("/main/{entId}")
	public ModelAndView main(@PathVariable("entId")long entId){
		ModelAndView model=new ModelAndView();
		model.setViewName("/index");
		model.addObject("entId", entId);
		return model;
	}
	
	/**
	 * 信息管理
	 * @return
	 */
	@RequestMapping("/infoManage")
	public String infoManage(){
		return "xinxiweihu";
	}
	
	/**
	 * 在线报案
	 * @return
	 */
	@RequestMapping("/onlineReport")
	public String onlineReport(){
		return "zaixianbaoan";
	}
	 
	/**
	 * 进度查询
	 * 
	 * @return
	 */ 
	@RequestMapping("/processQuery")
	@ResponseBody
	public String processQuery(HttpServletRequest request, Integer pageNo,
			Integer pageSize, String licensePlage, String insuredName,
			String caseProgress) {
		HttpSession session = request.getSession();
		String entId = null;
		try {
			if (session.getAttribute("entId") != null) {
				entId = (String) session.getAttribute("entId");
			}
			PagedResult<PolicyClaimProgressView> pagedResult = progressQueryService
					.queryProgress(pageNo, pageSize, licensePlage, insuredName,
							caseProgress, entId);
			request.setAttribute("pageBean", pagedResult);
		} catch (Exception e) {
			logger.error("查询进度失败...");
		}
		return "jinduchaxun";
	}
	
	@RequestMapping("/entLogin")
	@ResponseBody
	public Map<String, Object> entLogin(HttpServletRequest request){
		Map<String, Object> map=new HashMap<String, Object>();
		String entCode=request.getParameter("entCode");
		String password=request.getParameter("password");
		try {
			EnterPrise entPrise=enterPriseService.getLoginEnt(entCode,password);
			if(entPrise!=null){
				map.put("flag", true);
				map.put("entId", entPrise.getEntId());
				//信息加入缓存
				
				
				HttpSession session = request.getSession();
				session.setAttribute("entId",entPrise.getEntId());
				
			}else{
				map.put("flag", false);
				map.put("message", "账号或密码出错!");
			}
		} catch (Exception e) {
			map.put("flag", false);
			map.put("message", "未知错误，请稍后再试");
			e.printStackTrace();
		}
		return map;
	}
	
	
	@RequestMapping("/entMain/{entId}")
	public ModelAndView entMain(HttpServletRequest request,
			@PathVariable("entId") long entId,
			@ModelAttribute("page") PageEntity page,
			@ModelAttribute("policy")EntPolicy policy){
		//page默认10行第一页
		ModelAndView model=new ModelAndView();
		policy.setEntId(entId);
		policy.setIsdel(0);
		
		try {
			List<EntPolicy> entPolicyList=entPolicyService.getEntPolicyInfo(policy,page);
			model.setViewName("/xinxiweihu");
			model.addObject("entPolicyList", entPolicyList);
			model.addObject("page",page);
			model.addObject("policy", policy);
		} catch (Exception e) {
			e.printStackTrace();
			//出错页面
			model.setViewName("");
		}
		return model;
	}
	
	@RequestMapping("/deletePolicy")
	@ResponseBody
	public Map<String,Object> deletePolicy(HttpServletRequest request){
		Map<String,Object> map=new HashMap<String, Object>();
		String policyList=request.getParameter("policyList");
		List<Integer> list=new ArrayList<Integer>();
		if (policyList.contains(",")) {
			//多保单删除
			String[] policyArr = policyList.split(",");
			for (int i = 0; i < policyArr.length; i++) {
				list.add(Integer.valueOf(policyArr[i]));
			}
		}else{
			list.add(Integer.valueOf(policyList));
		}
		try {
			entPolicyService.deleteEntPolicy(list);
			map.put("flag", true);
			map.put("message", "删除成功!");
		} catch (Exception e) {
			map.put("flag", false);
			map.put("message", "未知错误，请稍后再试");
			e.printStackTrace();
		}
		return map;
	}
	
}
