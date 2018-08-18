package com.yunhe.lianxi;

import java.util.Scanner;

public class Lianxi8 {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++){
			
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数s:");
		int s= sc.nextInt();//从控制台输入整数
		
		System.out.println("请输入第二个整数s2:");
		int s2= sc.nextInt();
		
		if(s%s2==0){
			System.out.println("是倍数");
		}else{
			System.out.println("不是倍数");
		}
		
		System.out.println("请问是否结束循环:y/n");
		Scanner sc1= new Scanner(System.in);
		String p = sc1.next();
			if(p.equals("y")){
				break;
			}
		}
		
	}
}
