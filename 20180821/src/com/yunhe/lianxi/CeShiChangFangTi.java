package com.yunhe.lianxi;

public class CeShiChangFangTi {
	
		public static void main(String[] args) {
			
			
			ChangFangTi cft = new ChangFangTi(2, 3, 4);
			
			int dimian = cft.diMianJi();
			
			System.out.println(dimian);
			
			//有两个参数
			System.out.println(cft.dimianji(4,5));
			
			
			int c=4;
			int g=5;
			int k=6;
			System.out.println(cft.tiJi(g,c,k));
			
			
			
			ChangFangTi cft3 = new ChangFangTi(4,0,6);
			System.out.println(cft3.chang+":"+cft3.width+":"+cft3.gao);
			
		}
		
}
