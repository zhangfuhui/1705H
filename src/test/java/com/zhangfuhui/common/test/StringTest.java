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
		
		String a = "9��5��һ���磬�����������\n����9��࣬����������ó�߼������ǣͷ��ͨ������Ϣ��\n9��5�����磬�й��������ξ�ίԱ������Ժ����������ȫ�澭�öԻ��з�ǣͷ������ӦԼ������ó�״�������ϣ�󡢲�������ķŬ��ͨ����\r";
		String html = StringUtil.toHtml(a);
		System.out.println(html);
	}

}
