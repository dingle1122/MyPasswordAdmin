package cn.lzyike.util;

import java.util.UUID;
/**
 * UUID工具类
 * @author dingle
 *
 */
public class UUIDUtil {
	/**
	 * 得到32位UUID
	 * @return uuid
	 */
	public static String getUUID(){
		UUID uuid=UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}
}
