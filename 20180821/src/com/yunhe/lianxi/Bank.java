package com.yunhe.lianxi;

public class Bank {
	String bankName;
	int bankAccount;
	double bankMoney;
	
	public Bank(){
		
	}
	public Bank(String bankName, int bankAccount, double bankMoney) {
		
		this.bankName = bankName;
		this.bankAccount = bankAccount;
		this.bankMoney = bankMoney;
	}
	
	//存钱的方法
	public void add(int money){
		if( this.bankAccount == 0 ){
			System.out.println("账户不存在!");
		}else{
			this.bankMoney+=money;
			System.out.println("账户余额:"+this.bankMoney+"刚存入:"+money);
		}
	}
	
	//取钱的方法
	public void quQian(int money){
		if(this.bankMoney>=money){
			this.bankMoney-=money;
			System.out.println("取钱成功，账户余额:"+this.bankMoney);
		}else{
			System.out.println("余额不足!取钱失败");
		}
	}
	
	//销户
	public void xiaoHu(){
		if(this.bankMoney>0){
			System.out.println("账户有钱，请取完钱，再销户!");
		}else{
			this.bankName=null;
			this.bankAccount=0;
			this.bankMoney=0.0;
			System.out.println("销户成功");
		}
	}
	
	
}
