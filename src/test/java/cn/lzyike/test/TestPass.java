package cn.lzyike.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import cn.lzyike.util.PasswordUtil;
import cn.lzyike.util.StringUtil;

public class TestPass {
	private static Logger logger=LogManager.getLogger(TestPass.class);
	@Test
	public void test() {
		for(int i=0;i<10;i++) {
			logger.info(PasswordUtil.createPassword(null,null));
		}
		for(int i=0;i<10;i++) {
			logger.info(PasswordUtil.createPassword(StringUtil.numberString(),null));
		}
		for(int i=0;i<10;i++) {
			logger.info(PasswordUtil.createPassword(StringUtil.numberString(),6));
		}
		for(int i=0;i<10;i++) {
			logger.info(PasswordUtil.createPassword(null,16));
		}
	}
}
