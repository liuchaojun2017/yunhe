package com.yunhe.liucheng;

public class LianXi {
	public static void main(String[] args) {
	  /*1-3 为春
		4-6 为夏
		7-9 为秋
		10-12 为冬*/
		int ji=3;
		jiJie(ji);
		
		/*怎么区分大小 找出最大的值
		 * 思路：两个两个的比较
		 * 		a 和 b比较 找出 其最大值  
		 * 		再用最大值和 c比较
		 * 		
		 * */
		int a=3,b=5,c=2;
		
		if(a>b){
			/*   a是最大的 拿a和第三个数c比较   */
			if(a>c){
				/*a>b 成立   a和c的比较 没有b的事   a>c 成立 a 就是最大值*/
				System.out.println("最大值："+a);
			}else{
				/*a>b成立  a>c 不成立  c是最大值*/
				System.out.println("最大值："+c);
			}
		}else{
			/*b>=a 成立   b和c比较  b>c 成立 b是最大  不成立则是c最大*/
			if(b>c){
				System.out.println("最大值是b:"+b);
			}else{
				
				System.out.println("最大值是c:"+c);
			}
		}
		
	}

	private static void jiJie(int ji) {
		if(ji>=1 && ji<=3){
			System.out.println("春季");
		}else if(ji>=4 && ji<=6){
			System.out.println("夏季");
		}else if(ji>=7 && ji<=9){
			System.out.println("秋季");
		}else if(ji>=10 && ji<=12){
			System.out.println("冬季");
		}
	}
}
