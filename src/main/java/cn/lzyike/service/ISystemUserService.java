package cn.lzyike.service;

import java.util.List;

import cn.lzyike.entity.SystemUser;

public interface ISystemUserService {
	public void insert(SystemUser user);
	public void delete(String id);
	public void updeate(SystemUser user);
	public List<SystemUser> qurryAll();
	public SystemUser qurryById(String id);
	public SystemUser login(String name,String password);
}