package com.yunhe.lianxi;

public class Lianxi6 {
	public static void main(String[] args) {
		int sum=1; //不能定义为0的初始值 为零时 结果必定为0
		for(int i=5;i>=1;i--){
			sum*=i;
		}
		System.out.println(sum);
	}
	
}

