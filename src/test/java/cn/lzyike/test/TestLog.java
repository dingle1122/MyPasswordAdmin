package cn.lzyike.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class TestLog {
	private static Logger logger=LogManager.getLogger(TestLog.class);
	@Test
	public void test() {
		logger.trace("trace log4j !");
		logger.debug("debug log4j !");
		logger.info("info log4j !");
		logger.warn("warm log4j !");
		logger.error("error log4j !");
		logger.fatal("fatal log4j !");
	}
}
