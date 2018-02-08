package cn.lzyike.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cn.lzyike.entity.SystemUser;

/**
 * 密码管理类
 * @author dingle
 *
 */
public class PasswordUtil {
	private static Logger logger=LogManager.getLogger(PasswordUtil.class);
	/**
	 * 加密用户密码
	 * @param user 系统用户
	 * @return 加密后的密码
	 */
	public static String sysPassword(SystemUser user) {
		StringBuffer psd=new StringBuffer();
		psd.append(user.getUserName());
		psd.append(user.getId());
		psd.append(user.getUserPassword());
		user.setUserPassword(MD5Util.getMD5(psd.toString()));
		return user.getUserPassword();
	}
	
	/**
	 * 密码生成器
	 * @param basicsCahr 基础字符串
	 * @param length 密码长度
	 * @return 随机生成的密码
	 */
	public static String createPassword(String basicsCahr,Integer length) {
		Random random=new Random();
		StringBuffer password=new StringBuffer();
		length = (length==null)? 8:length;
		if(basicsCahr==null) {
			basicsCahr=StringUtil.stitching(StringUtil.numberString(),
					StringUtil.upperCase(),StringUtil.lowerCase(),
					StringUtil.specialCharacter());
		}
		for(int i=0;i<length;i++) {
			int index=random.nextInt(basicsCahr.length());
			password.append(basicsCahr.charAt(index));
		}
		return password.toString();
	}
	
	/**
	 * 对密码进行AES加密
	 * @param key 加密密钥
	 * @param password 密码
	 * @return 加密后的结果
	 */
	public static String encryption(String key,String password) {
		if(key==null || password==null || "".equals(password)) {
			logger.error("加密参数有误");
			return null;
		}
		List<String> passwords=StringUtil.StringAt(password, 15);
		List<String> encrs=new ArrayList<String>();
		for(String pass:passwords) {
			String encr=AESUtil.encrypt(pass, key);
			encrs.add(encr);
		}
		return encrs.toString();
	}
	
	/**
	 * 对ASE加密后的结果进行解密
	 * @param key 解密密钥
	 * @param context 密文
	 * @return 解密后的结果
	 */
	public static String decrypt(String key,String context) {
		if(key==null || context==null || "".equals(context)) {
			logger.error("解密参数有误");
			return null;
		}
		context=context.substring(1, context.length()-1);
		String[] contexts=context.split(", ");
		StringBuffer password=new StringBuffer();
		for(String con:contexts) {
			String pass=AESUtil.decrpyt(con, key);
			password.append(pass);
		}
		return password.toString();
	}
	
}
