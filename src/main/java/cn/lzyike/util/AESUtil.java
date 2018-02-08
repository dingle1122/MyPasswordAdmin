package cn.lzyike.util;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * AES加密工具类
 * @author dingle
 * 
 */
public class AESUtil {
	private static Logger logger=LogManager.getLogger(AESUtil.class);
	private static final String ALGORITHM = "AES";
	
	/**
	 * 计算加密密钥
	 * @param keys 密钥种子
	 * @return 密钥
	 * @throws NoSuchAlgorithmException
	 */
	private static SecretKey getsecretKey(String keys) throws NoSuchAlgorithmException {
		SecureRandom random = new SecureRandom();
		random.setSeed(keys.getBytes());
		KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
		keyGenerator.init(random);
		SecretKey secretKey = keyGenerator.generateKey();
		return secretKey;
	}
	
	/**
	 * 对字符串进行加密
	 * @param context 加密内容
	 * @param key 密钥
	 * @return 加密后的结果,返回空为加密失败
	 */
	public static String encrypt(String context,String keys) {
		try {
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			SecretKey secretKey=getsecretKey(keys);
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			cipher.update(context.getBytes());
			byte[] result = cipher.doFinal();
			String base64Result = Base64.getEncoder().encodeToString(result);
			return base64Result;
		} catch (Exception e) {
			logger.error("加密失败！");
			logger.error(e.getMessage());
			return null;
		}
	}
	
	/**
	 * 解密字符串
	 * @param context 解密内容
	 * @param keys 密钥
	 * @return 解密后的结果,返回空为解密失败
	 */
	public static String decrpyt(String context,String keys) {
		try {
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			SecretKey secretKey = getsecretKey(keys);
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] encodedBytes = Base64.getDecoder().decode(context.getBytes());
			byte[] result = cipher.doFinal(encodedBytes);
			return new String(result);
		} catch (Exception e) {
			logger.error("解密失败！");
			logger.error(e.getMessage());
			return null;
		}
	}
}
