package cn.lzyike.util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * MD5工具类
 * @author dingle
 *
 */
public class MD5Util {
	/**
	 * 计算MD5值，如果无法计算返回null
	 * @param str 源字符串
	 * @return 计算出的MD5值，计算失败返回null
	 */
	public static String getMD5(String str) {
		return getMD5(str, 16);
	}
	/**
	 * 计算MD5值，如果无法计算返回null
	 * @param str 源字符串
	 * @param bit 加密为多少位MD5值
	 * @return 计算出的MD5值，计算失败返回null
	 */
	public static String getMD5(String str,int bit) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			return new BigInteger(1, md.digest()).toString(bit);
		} catch (Exception e) {
			return null;
		}
	}
}
