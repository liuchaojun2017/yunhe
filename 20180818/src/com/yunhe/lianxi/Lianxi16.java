package com.yunhe.lianxi;

public class Lianxi16 {
	
	public static void main(String[] args) {
		//整体控制 行
		for(int h=1;h<=5;h++){
		//控制空格
			for(int k=1 ;k<=5-h;k++){
				System.out.print(" ");
			}
			//控制 * 
			for(int x=1;x<=2*h-1;x++){
				System.out.print("*");
			}
			System.out.println();
		}
		//控制下半部的行
		for(int h1=4;h1>=1;h1--){
			//控制空格
			for(int k1=1;k1<=5-h1;k1++){
				System.out.print(" ");
			}
			//控制* 
			for(int x1=1;x1<=2*h1-1;x1++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
