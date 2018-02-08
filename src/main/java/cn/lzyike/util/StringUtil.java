package cn.lzyike.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串工具类
 * @author dingle
 *
 */
public class StringUtil {
	/**
	 * @return 返回0~9的数字组成的字符串
	 */
	public static String numberString() {
		return "0123456789";
	}
	
	/**
	 * @return 返回大写字母
	 */
	public static String upperCase() {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	}
	
	/**
	 * @return 返回小写字母
	 */
	public static String lowerCase() {
		return "abcdefghijklmnopqrstuvwxyz";
	}
	
	/**
	 * @return 返回常见特殊字符
	 */
	public static String specialCharacter() {
		return "~`!@#$%^&*()_-+={}[]:|;'<>,.?/";
	}
	
	/**
	 * 字符串拼接
	 * @param strings 要拼接的字符串
	 * @return 返回拼接后的字符串
	 */
	public static String stitching(String ... strings) {
		StringBuffer appString=new StringBuffer();
		for(String str:strings) {
			appString.append(str);
		}
		return appString.toString();
	}
	
	/**
	 * byte数组转16进制字符串
	 * @param bytes byte数组
	 * @return
	 */
	public static String bytesToHex(byte[] bytes) {  
		char[] hexArray = "0123456789ABCDEF".toCharArray();
	    char[] hexChars = new char[bytes.length * 2];  
	    for ( int j = 0; j < bytes.length; j++ ) {  
	        int v = bytes[j] & 0xFF;  
	        hexChars[j * 2] = hexArray[v >>> 4];  
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];  
	    }  
	    return new String(hexChars);  
	}
	
	/**
	 * 16进制转byte数组
	 * @param hexString 16进制字符串
	 * @return
	 */
	public static byte[] hexStringToBytes(String hexString) {
		char[] hexArray = "0123456789ABCDEF".toCharArray();
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		hexString = hexString.toUpperCase();
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (hexArray[hexChars[pos]] << 4 | hexArray[hexChars[pos + 1]]);
		}
		return d;
	}
	
	public static List<String> StringAt(String str,int len) {
		StringBuffer sb=new StringBuffer(str);
		List<String> strings=new ArrayList<String>();
		do {
			strings.add(sb.substring(0, len));
			sb.delete(0, len);
		}while(sb.length()>len);
		strings.add(sb.toString());
		return strings;
	}
}
