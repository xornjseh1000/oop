/**
 * 
 */
package controller;

/**
 * @date   :2016. 6. 14.
 * @author :김동혁
 * @file   :Kaup.java
 * @story  :
 */
public class Kaup {
	public String execute(String name, double inputNum1,  double inputNum2) {
	String name1 = name;
	String result = "";
	double bmi = 0.0, height = inputNum1 , weight=inputNum2;
	//------------------op------------------------------
	
	
	
	bmi = weight / (height/100) / (height/100);
	
	if (bmi < 18.5) {
		result = "저체중";
	} else if(18.5<=bmi && bmi <= 22.9){
		
		result = "정상체중";
	} else if(bmi >= 23.0 && bmi <= 24.9){
		
		result = "위험체중";
	} else if(bmi >= 25.0 && bmi <= 29.9){
		
		result = "비만 1단계";
	} else if(bmi >= 30.0 && bmi <= 39.9){
		
		result = "비만 2단계";
	} else if(bmi >= 40){
		
		result = "비만 3단계";
	}
	
	double d = Double.parseDouble(String.format("%.2f", bmi));
	 return name1+"은 BMI지수는 "+d+
			"이고, "+result+ "이다 ";
	
	
}

}
	
	
	



