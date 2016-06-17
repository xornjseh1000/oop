/**
 * 
 */
package controller;

/**
 * @date   :2016. 6. 14.
 * @author :김동혁
 * @file   :Calc.java
 * @story  :
 */
public class Calc {
	public String execute(int inputNum1,String opcode,
			int inputNum2){
		int num1=0,num2=0,result=0;
		String op = opcode;
		num1 = inputNum1;
		num2 = inputNum2;
		
		
		switch (op) {
		case "+":
			op = "+";
			result= num1+num2;
			break;
		case "-":
			op = "-";
			result= num1-num2;	
			break;
		case "*":
			op = "*";
			result= num1*num2;
			break;
		case "/":
			op = "/";
			result= num1/num2;
			break;
		case "%":
			op = "%";
			result= num1%num2;	
			break;
		default:
			System.out.println("1~5까지만 입력바랍니다");
			break;
		}
		//----------out-----------
		return num1+op+num2+"="+result;
	}
}
