package com.yunhe.lianxi;

public class Ball {
	int radius;

	
	public Ball(){
		
	}
	public Ball(int radius) {
		this.radius = radius;
	}
	
	
	public double tiji(){
		return this.radius*this.radius*this.radius*3.14*4/3;
	}
	
	
	public static void main(String[] args) {
		int r=3;
		Ball b= new Ball(r);
		System.out.println(b.tiji());
	}
}
