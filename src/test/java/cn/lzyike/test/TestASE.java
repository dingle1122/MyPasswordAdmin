package cn.lzyike.test;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import cn.lzyike.util.AESUtil;
import cn.lzyike.util.PasswordUtil;
import cn.lzyike.util.StringUtil;

public class TestASE {
	private static Logger logger=LogManager.getLogger(TestASE.class);
	@Test
	public void test() {
		String keys="d686eb1cbec5478038b48e7792fe62c0";
		String context="8b48e7792fe62c0";
		logger.info("原文："+context);
		String ase=AESUtil.encrypt(context,keys );
		logger.info("加密："+ase);
		String unase=AESUtil.decrpyt(ase, keys);
		logger.info("解密："+unase);
		List<String> ss=StringUtil.StringAt(context, 15);
		logger.info(ss);
		for(String s:ss) {
			logger.info(s);
		}
		logger.info("=============================================");
	}
	@Test
	public void testpass() {
		String key= "d686eb1cbec5478038b48e7792fe62c0";
		String password="d686eb1cbec5478038b48e7792fe62c0";
		logger.info(password);
		String context=PasswordUtil.encryption(key, password);
		logger.info(context);
		String last=PasswordUtil.decrypt(key, context);
		logger.info(last);
	}
}
