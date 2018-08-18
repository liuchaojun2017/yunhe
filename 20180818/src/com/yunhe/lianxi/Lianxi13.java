package com.yunhe.lianxi;

public class Lianxi13 {
	
	public static void main(String[] args) {
		
		/*2+22+222+2222+22222*/
		
		int i=2;
		int sum=0;
		while(i<=22222){
			sum+=i;
			i=i*10+2;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
