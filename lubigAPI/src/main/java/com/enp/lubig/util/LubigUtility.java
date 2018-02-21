package com.enp.lubig.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * lubig util
 * @author crPark
 *
 */
public class LubigUtility {

	/**
	 * uuid 난수 생성
	 * @return
	 */
	public static String getUUID() {
		String uuID = UUID.randomUUID().toString();
		String uuid = null;
		try {
			uuid = uuID.replace("-", "");
		} catch (Exception e) {
			if (uuid == null)
				return getUUID();
		}
			

		return uuid;
	}

	/**
	 * 7자리 uuid 난수 생성
	 * 중복 가능성 있음
	 * @return
	 */
	public static String getUUIDtoLength7() {
		String uuID = UUID.randomUUID().toString();
		int start = (int) (Math.random() * 27);
		String uuid7 = null;
		try {
			uuid7 = uuID.replace("-", "").substring(start, start + 7);
		} catch (Exception e) {
			if (uuid7 == null)
				return getUUID();
		}

		return uuid7;
	}
	
	/**
	 * 난수 발생기
	 * 
	 * @author crPark
	 * @param length
	 * @return
	 */
	public static int generateNumber(int length) {
		String numStr = "1";
		String plusNumStr = "1";

		for (int i = 0; i < length; i++) {
			numStr += "0";
			if (i != length - 1) {
				plusNumStr += "0";
			}
		}
		Random random = new Random();
		int result = random.nextInt(Integer.parseInt(numStr)) + Integer.parseInt(plusNumStr);

		if (result > Integer.parseInt(numStr)) {
			result = result - Integer.parseInt(plusNumStr);
		}
		return result;
	}
	
	/**
	 * 폰 번호 유효성 체크 (단일)
	 * ( 01xxx(x)xxxx, 01x-xxx(x)-xxxx)
	 * 10, 11자리 만 허용
	 * 
	 * @author crPark
	 * @param digit
	 * @return
	 */
	public static boolean matchesPhonNum(String digit) {
		
		String pattern = "^01\\d{8,9}|^01\\\\d{1}[-]\\\\d{3,4}[-]\\\\d{4}";
		
		return digit.matches(pattern);
	}
	
	/**
	 * 폰 번호 유효성 체크 (리스트)
	 * ( 01xxx(x)xxxx, 01x-xxx(x)-xxxx)
	 * 10, 11자리 만 허용
	 * 
	 * @author crPark
	 * @param digit
	 * @return
	 */
	public static Map<String, Object> matchesPhonNum(String[] digit) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		String pattern = "^01\\d{8,9}|^01\\\\d{1}[-]\\\\d{3,4}[-]\\\\d{4}";

		for(String inputStr : digit) {
			result.put(inputStr, inputStr.matches(pattern));
		}
		
		return result;
	}
	
	/**
	 * 폰 번호에서 "-","(",")" 를 제거한다.
	 * 
	 * @author crPark
	 * @param digit
	 * @return
	 */
	public static String extractDigit(String digit) {
		if(digit.indexOf("-") != -1) {
			digit = digit.replace("-", "");
		}
		if(digit.indexOf("(") != -1) {
			digit = digit.replace("(", "");
			digit = digit.replace(")", "");
		}
		return digit;
	}
	
}
