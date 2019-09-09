package com.zhangfuhui.common.utils;

public class StringUtil {
	
	public static String toHtml(String text){
		String replace = text.replace("\r", "<br/>");
		String replace1 = replace.replace("\n\r", "\n");
		String replace2 = replace1.replace("\n", "<p>");
		return replace2;
	}
	
	public static boolean isPhone(String number){
		String str="^1[3|5|9|7]\\d{9}$";
		boolean matches = number.matches(str);
		return matches;
	}
	
	public static boolean isEmail(String email){
		String str="^\\w+(@\\w+\\.)\\w{2,3}$";
		boolean matches = email.matches(str);
		return matches;
	}

}
