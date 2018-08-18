package com.yunhe.lianxi;

public class Lianxi7 {
	
	public static void main(String[] args) {
		
		/*
		 * 912
		         百位：9   912/100   
		         十位：1   912/10%10
		         个位：2   912%10
		 */
		int count=0;//水仙花数的个数
		for(int i=100;i<1000;i++){
			
			int b=i/100;  
			int s=i/10%10;
			int g=i%10;
			
			if(b*b*b+s*s*s+g*g*g == i){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("水仙花数的个数："+count);
	}
}
