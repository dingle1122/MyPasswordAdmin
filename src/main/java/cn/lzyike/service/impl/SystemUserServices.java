package cn.lzyike.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lzyike.dao.ISystemUserDao;
import cn.lzyike.entity.SystemUser;
import cn.lzyike.service.ISystemUserService;
import cn.lzyike.util.PasswordUtil;
import cn.lzyike.util.UUIDUtil;

@Service("SystemUserServices")
public class SystemUserServices implements ISystemUserService {
	@Autowired
	ISystemUserDao isu;

	public void insert(SystemUser user) {
		user.setId(UUIDUtil.getUUID());
		PasswordUtil.sysPassword(user);
		isu.insert(user);
	}

	public void delete(String id) {
		isu.delete(id);
	}

	public void updeate(SystemUser user) {
		PasswordUtil.sysPassword(user);
		isu.updeate(user);
	}

	public SystemUser login(String name,String password) {
		SystemUser user=isu.login(name);
		SystemUser loginUser=new SystemUser();
		loginUser.setId(user.getId());
		loginUser.setUserName(name);
		loginUser.setUserPassword(password);
		boolean isLogin=user.getUserPassword().equals(PasswordUtil.sysPassword(loginUser));
		if(isLogin) {
			return user;
		}else {
			return null;
		}
	}

	public List<SystemUser> qurryAll() {
		return isu.qurryAll();
	}

	public SystemUser qurryById(String id) {
		return isu.qurryById(id);
	}
	
}
