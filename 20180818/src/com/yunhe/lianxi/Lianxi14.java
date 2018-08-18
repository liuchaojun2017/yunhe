package com.yunhe.lianxi;

public class Lianxi14 {
	
		public static void main(String[] args) {
             //男人
			for(int i=1;i<=9;i++){
				//女的
				for(int j=1;j<=12;j++){
					//孩子  孩子只取偶数    两个孩子一块砖
					for(int h=2;h<=36;h=h+2){
						
						if(i+j+h==36 && i*4+3*j+h/2==36){
							System.out.println("男人："+i+"女人："+j+"儿童："+h);
						}
						
					}
				}
			}
		}
}
