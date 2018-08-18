package com.yunhe.liucheng;

public class DemoIf {
	
	public static void main(String[] args){
		/*关于if 结构    通过条件判断 执行分支代码    if的条件可以是表达式   判断的条件是 boolean类型的结果   */
		
		int age=15;
		
		if(age>18){//条件成立时执行此范围的语句体
			System.out.println("是成年人");
		}else{
			//条件不成立时 执行
			System.out.println("未成年人");
		}
		
		System.out.println("》》》》》》》》》》》》》》》");
		
		/*当条件成立与否时  语句体只有一句时可以省略 {}  当有多句执行语句时 必须写{} 
		 * 要求：不管是单句还是多句执行语句都写在{}内
		 * */
		if(age>18)//条件成立时执行此范围的语句体
			System.out.println("是成年人");
		
		else
			//条件不成立时 执行
			System.out.println("未成年人");
		
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		if(age<13);//只是简单做了判断 但是没有对应的语句体执行
		System.out.println("和符合复合");
		
		/*三目运算符可完成简单的if-else的功能，但不能代替所有的if-else 相反 if-else 可以实现三目运算符的所有功能*/
		System.out.println(age<13?"未成年":"成年");
		
		System.out.println("》》》》》》》》》》》》》》》》》》if - esle if");
		
		int score = 90;
		/*根据成绩判断其实优秀（90-100） 良好（80-90） 一般（70-80） 及格（60-70） 差（小于60） */
		
		/*else if 是在上一个紧邻的if条件为false时才执行*/
		if(score>=90 && score<=100){
			System.out.println("优秀的成绩");
		}else if(score>=80 && score<90){
			System.out.println("良好");
		}else if(score>=70 && score<80){
			System.out.println("一般");
		}else if(score>=60 && score<70){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		
		
		System.out.println("》》》》》》》》》》》》》》 多个if");
		
		if(score>=90 ){
			System.out.println("优秀的成绩");
		}if(score>=80){
			System.out.println("良好");
		}else if(score>=70 ){
			System.out.println("一般");
		}else if(score>=60 ){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		
	}
	
	
	
	
}
