package com.yunhe.liucheng;

public class DemoTiaoZhuan {
	/*break 中断
	 * 
	 *continue 继续
	 *  
	 *return 返回
	 *  */
		public static void main(String[] args) {
           //控制九九乘法表的行
			for(int i=1;i<10;i++){ 
				/*控制的是列*/
				for(int j=1;j<=i;j++){ 
					
					if(j==2){
						//break; //当 j==2 时 结束内层循环 （break 结束的是离它最近的循环）
						//continue; //当j==2 时 跳过本层的本次循环
						  return; //当j==2 时结束 方法内容
					}
					System.out.print("j:"+j+"*i:"+i+"="+i*j+" ");
					
				}
				System.out.println();
			}
				
		}
}
