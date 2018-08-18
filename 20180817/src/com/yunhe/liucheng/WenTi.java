package com.yunhe.liucheng;

public class WenTi {
	
	public static void main(String[] args) {
		
		
		/*for(设置变量以及初始化 (此处是局部变量只在 for循环内部有效);boolean 类型表达式;控制变量自增(在循环体最后执行)){
			
		}*/
		int i=0,sum=0;
		for(;i<=10;i++,sum++){
			sum+=i;
			System.out.println(sum);
			System.out.println(i);
		}
		
		System.out.println(i);
		
		
		/*key: byte shor int char String enum*/
		
		
		int x=2;
		char f='a';
		int a=99;
		
		switch (x+f) {
		case 99:
			System.out.println("dfjf");
			break;
		default:
			break;
		}
		
		int b=0;
		/*条件表达式 结果是boolean*/
		while(a++<5 && a-->4){
			
			while(b<a){
				
			}
			
		}
		
		for(int i1=1;i1<=9;){
			
			for(int j=1;j<=i1;){
				System.out.println(i*j);
				j++;
			}
			
			System.out.println("外出");
			i1++;
		}
		
	}	
}
