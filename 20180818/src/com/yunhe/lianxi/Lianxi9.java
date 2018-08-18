package com.yunhe.lianxi;

public class Lianxi9 {
	
	
	public static void main(String[] args) {
		
		int h=1;
		while(h<=5){
			
			int l=1; //让内层循环的l 每次都重新 从1 开始
			while(l<=h){
				System.out.print("*");
				l++;  
			}
			
			System.out.println();
			h++; 
		}
		
	}
}
