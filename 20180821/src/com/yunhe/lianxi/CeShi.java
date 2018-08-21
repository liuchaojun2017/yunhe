package com.yunhe.lianxi;

public class CeShi {
	
	public static void main(String[] args) {
		//通过什么方法实例化长方形对象    new 是跟着构造方法
		
		/* cfx:ChangFangXing 类型的引用变量的变量名 其值指向对象的地址
		 * new ChangFangXing() 通过无参构造方法开辟空间 存放一个 长方形对象
		 * */
		/*new 使用方法时 类中中必须有这样的方法*/
		
		ChangFangXing  cfx1 = new ChangFangXing();
		System.out.println(cfx1.chang +" "+cfx1.width);
		
		//使用一个参数的构造方法 创建对象 this.width=3 相当于 cfx2.width=3
		ChangFangXing  cfx2 = new ChangFangXing(5);
		System.out.println(cfx2.chang +" "+cfx2.width);

		//使用 两个参数的构造方法  cfx3.width=2 cfx3.chang=3   
		
		
		ChangFangXing cfx3 = new ChangFangXing(2,3);
		System.out.println(cfx3.width +" "+cfx3.chang);
	
		//使用 cfx3求周长     
		System.out.println("长"+cfx3.chang+"宽:"+cfx3.width+"的周长:"+cfx3.zhouChang());
		
		//使用cfx2求周长  由于 cfx2.chang初始值为0    在求周长的方法中设置cfx2.chang=1
		System.out.println("长:"+cfx2.chang+"宽:"+cfx2.width+"周长:"+cfx2.zhouChang()+"计算后的长:"+cfx2.chang);
		
		
		
		
	}
	
}
