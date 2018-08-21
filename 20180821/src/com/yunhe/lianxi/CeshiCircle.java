package com.yunhe.lianxi;

import java.util.Scanner;

public class CeshiCircle {
	
		public static void main(String[] args) {
			//Scanner 扫描器
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个半径：");
			int r = sc.nextInt();
			
			Circle c = new Circle(r);
			
			System.out.println(c.zhouChang());
			
			System.out.println(c.mianJi());
		}
}
