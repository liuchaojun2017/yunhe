package com.yunhe.liucheng;

public class DemoSwitch {
	
	public static void main(String[] args) {
		/*key:类型可以是 byte short int char enum String
		 * value:是key对应的类型值  value 的值在switch中是不能重复  value必须是一个常量
		 * 
		 * 
		 * */
		
		
	/*	switch (key) {
	  case value: key和value对应后执行的语句体;
			
			break;

		default:key和value对应不上时执行此处语句体;
			break;
		}*/
		String g="A";
	
		switch (g) {
		case "a":
			System.out.println("这是一个a");
			//break 代表结束此语句体 后面的不再执行 如果没有break 则满足条件后的case 的语句体会执行
			break; 
		case "A":
			System.out.println("这是一个A");
			break;
		case "b":
			System.out.println("这是一个b");
			break;
		case "1":
			System.out.println("这是一个字符串1");
			
			break;

		//在所有value 没有对应key值时 执行 default后的语句体	
		default:System.out.println("没有匹配的value值");
			break;
		}
	}
	
	
	
}
