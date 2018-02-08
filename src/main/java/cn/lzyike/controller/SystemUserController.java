package cn.lzyike.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lzyike.entity.SystemUser;
import cn.lzyike.service.ISystemUserService;

@Controller
@RequestMapping("/system")
public class SystemUserController {
	@Autowired
	@Qualifier("SystemUserServices")
	private ISystemUserService isus;
	@RequestMapping("/add")
	public ModelAndView insert(SystemUser system){
		isus.insert(system);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/system/select.do");
		return mav;
	}
	@RequestMapping("delete")
	public ModelAndView deltet(String id){
		isus.delete(id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/system/select.do");
		return mav;
	}
	@RequestMapping("update")
	public ModelAndView update(SystemUser system){
		isus.updeate(system);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/system/select.do");
		return mav;
	}
	
	@RequestMapping("/selectById")
	public ModelAndView selectById(String id){
		ModelAndView mav=new ModelAndView();
		mav.addObject("systemUser", isus.qurryById(id));
		mav.setViewName("system/uinfo");
		return mav;
	}
	
	@RequestMapping("/select")
	public ModelAndView select(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("systemUsers", isus.qurryAll());
		mav.setViewName("system/index");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(String name,String password,HttpServletRequest request) {
		ModelAndView mav=new ModelAndView();
		SystemUser systemUser=isus.login(name, password);
		if(systemUser!=null) {
			request.getSession().setAttribute("loginUser", systemUser);
			mav.setViewName("redirect:/system/select.do");
		}else {
			mav.addObject("msg","用户名或密码错误");
			mav.setViewName("system/login");
		}
		return mav;
	}
}
