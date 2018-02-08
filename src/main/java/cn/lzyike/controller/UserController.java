package cn.lzyike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lzyike.entity.UserInfo;
import cn.lzyike.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	@Qualifier("UserServices")
	private IUserService ius;
	@RequestMapping("/add")
	public ModelAndView insert(UserInfo user){
		ius.insert(user);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/user/select.do");
		return mav;
	}
	@RequestMapping("delete")
	public ModelAndView deltet(int id){
		ius.delete(id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/user/select.do");
		return mav;
	}
	@RequestMapping("update")
	public ModelAndView update(UserInfo user){
		ius.updeate(user);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/user/select.do");
		return mav;
	}
	
	@RequestMapping("/selectById")
	public ModelAndView selectById(int id){
		ModelAndView mav=new ModelAndView();
		mav.addObject("user", ius.qurryById(id));
		mav.setViewName("uinfo");
		return mav;
	}
	
	@RequestMapping("/select")
	public ModelAndView select(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("ulist", ius.qurryAll());
		mav.setViewName("index");
		return mav;
	}
}
