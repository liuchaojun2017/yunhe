package com.yunhe.lianxi;

public class ChangFangXing {
	int width;
	int chang;
	
	//构造方法怎么写  public ChangFangXing(){}
	
	
	
	/* 1、构造方法的方法名必须和类名一致   
	 * 2、没有返回    
	 * 3、注意:每一个类中都有一个默认的无参的构造方法，如果我们自定义了构造方法以后，默认的无参构造方法就没有了
	 * */
	
	/* 构造方法的作用:
	 * 创建实例化对象   并初始化对象的属性值
	 * 
	 * */
	
	/*当我们未定义任何的构造方法时 在类中时默认的有一个默认无参的构造方法
	 * 如下:
	 * */
	public ChangFangXing(){
		
	}
	
	/*当我们自定义一个有参的构造方法时，默认的无参构造方法就会消失，
	如果需要使用无参的构造必须重新显示的声明定义一个无参的构造方法*/
	public ChangFangXing(int width){
		this.width=width;
	}
	
	//两个参数的构造方法
	public ChangFangXing(int kuang,int chang1){
		this.width=kuang;
		this.chang=chang1;
	}
	
	
	//方法：求周长     此类中的方法必须是此类的对象才能调用   （静态方法除外）
	public int zhouChang(){
		//this 代表调用该方法的对象
		if(this.width==0){
			this.width=1;
		}
		if(this.chang==0){
			this.chang=1;
		}
		return 2*(this.width+this.chang);
	}
	
	//方法 求面积  
	public int mianJi(){
		if(this.width==0){
			this.width=1;
		}
		if(this.chang==0){
			this.chang=1;
		}
		return (this.width*this.chang);
	}
	
}
