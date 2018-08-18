package com.yunhe.liucheng;

public class TiaoZhuanBiao {
		public static void main(String[] args) {
			//控制九九乘法表的行
			out:for(int i=1;i<10;i++){ 
				/*控制的是列*/
				for(int j=1;j<=i;j++){ 
					if(j==3){
						//break out;//结束的是标志位后的循环
						continue out;//跳转执行标志位后的内容
					}
					System.out.print("j:"+j+"*i:"+i+"="+i*j+" ");
				}
				System.out.println();
			}	
		}
     }