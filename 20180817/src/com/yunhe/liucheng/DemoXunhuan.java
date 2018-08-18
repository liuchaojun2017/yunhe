package com.yunhe.liucheng;

public class DemoXunhuan {
	
	public static void main(String[] args) {
		
		/*循环：将重复的操作进行抽取 放到循环体中 使用循环判断条件进行循环操作
		 * 
		 * for(定义变量及变量初始化赋值;循环判断条件;变量的规则表达式){循环执行的语句体}
		 * 
		 * 条件表达式默认是 true  为true时 是一个死循环
		 * */ 
		
	/*	for(int i=1;i<=10;i=i+2){
			
			System.out.println(i);
			
		}*/
		
		
		/*while 循环打印1-10的数字*/
		
		/*while(必须是一个结果为boolean类型的表达式)*/
		int i=1;
		while(i>10){
			System.out.println(i);
			i++;
		}
		
		
/*当第一次条件为false时 do-while 会优先执行一次循环体  while是一次都没有
*   如果判断条件第一次不是false do-while 和while的结果一致
*/
		do{
			System.out.println(i);
			i++;
		}while(i>10);
		
	}
}
