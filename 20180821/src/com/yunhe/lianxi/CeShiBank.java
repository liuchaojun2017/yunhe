package com.yunhe.lianxi;

import java.util.Scanner;

public class CeShiBank {

	public static void main(String[] args) {

		Bank b = new Bank("中国人民银行", 123456, 1000.0);

		while (true) {

			System.out.println("请输入你要操作的金额：");
			Scanner sc1 = new Scanner(System.in);
			int money = sc1.nextInt();

			System.out.println("请选择你的操作:1、取钱   2、存钱  3、销户");

			Scanner sc = new Scanner(System.in);
			int xuan = sc.nextInt();
			switch (xuan) {
			case 1:
				b.quQian(money);
				break;
			case 2:
				b.add(money);
				break;
			case 3:
				b.xiaoHu();
				break;
			default:
				System.out.println("输入的不是正常选择！");
				break;
			}
		}
	}
}
