package cn.lzyike.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lzyike.dao.IUserDao;
import cn.lzyike.entity.UserInfo;
import cn.lzyike.service.IUserService;

@Service("UserServices")
public class UserServices  implements IUserService{
	@Autowired
	private IUserDao iud;
	public void insert(UserInfo user) {
		iud.insert(user);
	}
	public void delete(int id) {
		iud.delete(id);
	}
	public void updeate(UserInfo user) {
		iud.updeate(user);
	}
	public List<UserInfo> qurryAll() {
		return iud.qurryAll();
	}
	public UserInfo qurryById(int id) {
		return iud.qurryById(id);
	}
	public UserInfo qurryLogin(String loginName, String loginPwd) {
		return iud.qurryLogin(loginName, loginPwd);
	}
	public int qurryCont() {
		return iud.qurryCont();
	}
	public List<UserInfo> qurryByLimit(int s, int e) {
		return iud.qurryByLimit(s, e);
	}
	public List<UserInfo> qurrySume(UserInfo user) {
		return iud.qurrySume(user);
	}
	public List<UserInfo> qurrySumeByOr(UserInfo user) {
		return iud.qurrySumeByOr(user);
	}
	public List<UserInfo> qurryByIds(List<Integer> ids) {
		return qurryByIds(ids);
	}
}
