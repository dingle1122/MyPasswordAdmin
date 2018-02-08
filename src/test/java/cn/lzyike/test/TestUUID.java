package cn.lzyike.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import cn.lzyike.util.UUIDUtil;

public class TestUUID {
	private static Logger logger=LogManager.getLogger(TestLog.class);
	@Test
	public void test() {
		for(int i=0;i<10;i++) {
			logger.info(UUIDUtil.getUUID());
		}
	}
}
