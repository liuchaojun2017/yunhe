package com.yunhe.test;

import java.util.Scanner;

public class Xunzu1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	
	switch(a){
	case 1:
		System.out.println("星期一");
		break;
	case 2:
		System.out.println("星期二");
		break;
	case 3:
		System.out.println("星期三");
		break;
	default:
		System.out.println("输入有误");
		break;
	}
	System.out.println();
}
}
