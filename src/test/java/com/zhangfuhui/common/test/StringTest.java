package com.zhangfuhui.common.test;

import com.zhangfuhui.common.utils.StringUtil;

public class StringTest {
	
	public static void main(String[] args) {
//		String a = "15935457350";
//		String b = "48651324851";
//		boolean phone = StringUtil.isPhone(a);
//		System.out.println(phone);
		
//		String a = "2509049221@qq.com";
//		String b = "2509049221@.com";
//		String c = "2509049221@qq.comm";
//		boolean Email = StringUtil.isEmail(a);
//		boolean Email1 = StringUtil.isEmail(b);
//		boolean Email2 = StringUtil.isEmail(c);
//		System.out.println(Email);
//		System.out.println(Email1);
//		System.out.println(Email2);
		
		String a = "9月5日一大早，又有了新情况\n上午9点多，传出中美经贸高级别磋商牵头人通话的消息。\n9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。\r";
		String html = StringUtil.toHtml(a);
		System.out.println(html);
	}

}
