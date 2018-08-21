package com.yunhe.lianxi;

public class Circle {
	int radius;
	
	public Circle(){
		
	}
	
    public Circle(int gh){
		this.radius=gh;
	}
	
	//方法：周长
    public double zhouChang(){
    	
    	return 2*3.14*this.radius;
    }
    //面积
    public double mianJi(){
    	return 3.14*this.radius*this.radius;
    }
}
