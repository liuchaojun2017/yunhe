package com.yunhe.lianxi;

public class ChangFangTi {
    
	int chang;
	int gao;
	int width;
	
	
	public ChangFangTi(){
		
	}
	
	public ChangFangTi(int chang) {
		this.chang = chang;
	}

	
	public ChangFangTi(int chang, int gao) {
		
		this.chang = chang;
		this.gao = gao;
	}

	public ChangFangTi(int chang, int gao, int width) {
		if(gao==0){
			this.gao = 1;	
		}else{
			this.gao = gao;
		}
	    this.chang = chang;
		
		this.width = width;
	}
   /*方法的定义:
		格式:访问权限修饰符 （public protected private 默认）  返回类型（基本类型  引用类型  void） 方法名 (参数列表:数据类型  参数名,数据类型  参数名... ){方法体 有返回类型时 使用 return 否则不需写}
		参数列表根据需要指定 可以是多个 也可以是0个
		带有返回类型的方法 必须有 return 返回相应类型的数据
	方法的调用:
			对于非静态的方法 有此方法所在的类的对象 进行调用
			调用时注意：
			       1、参数列表:传入的实参  必须与 方法的定义中的形参保持一致（类型一致   个数一致  位置一致）
	*/
	
	public int diMianJi(){
		return this.chang*this.width;
	}
	
	//根据参数  的长 宽  计算底面积  直接使用形参的值  作为计算的值   
	public int dimianji(int c,int k){
		return c*k;
	}
	
	public int tiJi(int c,int g,int k){
		return (c+k)*g;
	}
	
	public void hu(int c,int g,int k){
		return; //结束本方法   
	}
		
}
