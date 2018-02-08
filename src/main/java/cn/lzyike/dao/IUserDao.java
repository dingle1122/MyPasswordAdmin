package cn.lzyike.dao;

import java.util.List;

import cn.lzyike.entity.UserInfo;

public interface IUserDao {
	public void insert(UserInfo user);
	public void delete(int id);
	public void updeate(UserInfo user);
	public List<UserInfo> qurryAll();
	public UserInfo qurryById(int id);
	public UserInfo qurryLogin(String loginName,String loginPwd);
	public int qurryCont();
	public List<UserInfo> qurryByLimit(int s,int e);
	public List<UserInfo> qurrySume(UserInfo user);
	public List<UserInfo> qurrySumeByOr(UserInfo user);
	public List<UserInfo> qurryByIds(List<Integer> ids);
}
