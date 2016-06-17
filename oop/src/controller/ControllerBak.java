/**
 * 
 */
package controller;
 
import java.util.Scanner;
 
import javax.swing.JOptionPane;
 
/**
 * @date   :2016. 6. 14.
 * @author :김동혁
 * @file   :Controller.java
 * @story  :
 */
public class ControllerBak {
	public static void main(String[] args) {
		String menu="";
		Scanner scanner = new Scanner(System.in);
		Calc calc = new Calc();
		Kaup kaup = new Kaup();
		MonthEnd monthEnd = new MonthEnd();
		Tax tax = new Tax();
		Gender gender = new Gender();
		int i = 0;
		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기 2,카우푸 3,년월말구하기 4,세금 구하기 0,종료");
			switch (menu) {
			case "1":
				System.out.println("첫번째숫자 : ");
				System.out.println("연산자 1입력시:+ , 2입력시:- , 3입력시:*,4입력시:/,5입력시:%");
				System.out.println("연산자 : ");
				System.out.println("두번째숫자 : ");
				
				System.out.println(calc.execute(scanner.nextInt(), scanner.next(), scanner.nextInt()));
				break;
			
			case "2":
				System.out.println("이름 ?");
				System.out.println("키 ?");
				System.out.println("몸무게 ?");
				System.out.println(kaup.execute(scanner.next(), scanner.nextDouble(), scanner.nextDouble()));
				
				break;
		
			case "3":
				System.out.println("월 입력?");
				//System.out.println(monthEnd.execute(scanner.nextInt()));
				break;
				
			
			case "4": 
				System.out.println("이름을 입력하세요");
				System.out.println("연봉을 입력하세요");
				System.out.println("세율이 바뀌었습니까?"
						+ "그대로이면 1, 바뀌었으면 2 를 입력하세요");
			//	System.out.println(tax.execute(scanner.next(), scanner.nextInt(), scanner.nextInt(), 
				//		scanner.nextDouble()));
				break;
			case "5" :
				System.out.println("이름?");
				System.out.println("SSN입력?");
			//	System.out.println(gender.execute(scanner.next(), scanner.next()));
				break;
			
			
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			
				default:
					JOptionPane.showMessageDialog(null, "메뉴에 없는번호 입니다");
				break;
			
			
			
			}
		
	}
 
}
 
	/**
	 * @param scanner
	 */
	private static void monthend(Scanner scanner) {
		int malil = 0;
		// ---------op --------
		System.out.println("년 입력?(예)2016");
		int year = scanner.nextInt();
		
		System.out.println("월 입력?(예)2");
		int month = scanner.nextInt();
 
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:malil=31;break;
		case 2:
			malil = (year%4==0&&year%100!=0||year%400==0)?29:28;
			break;
		case 4:case 6:case 9:case 11:malil=30;break;
		default:
			break;
		}
		System.out.printf("%d%s%d%s%d%s\n",year,"년",month,"월",malil,"일");
	}
 
	/**
	 * @param scanner
	 */
	private static void kaup(Scanner scanner) {
		String name="",result="";
		double height=0.0,weight=0.0,kaup=0.0;
		//---- op -----
		System.out.println("이름?");
		name = scanner.next();
		System.out.println("키?");
		height = scanner.nextDouble();
		System.out.println("몸무게?");
		weight = scanner.nextDouble();
		kaup = weight / (height / 100) / (height / 100);
		
		if (kaup < 18.5) {
			result = "저체중";
		}else if(kaup < 22.9 && kaup > 18.5){
			result = "정상";
		}else if(kaup < 24.9 && kaup > 23.0){
			result = "위험체중";
		}else if(kaup < 29.9 && kaup > 25.0){
			result = "비만1단계";
		}else if(kaup < 40 && kaup > 30.0){
			result = "비만2단계";
		}else if(kaup >= 40){
			result = "비만3단계";
		}
		/*double d = Double.parseDouble(String.format("%.2f", kaup));
		System.out.println(
				name+"은 BMI지수는 "+d+"이고,"+result+"이다"); */
		// 위 문장을 printf 로 변경하시오
		System.out.printf("%s은 BMI지수는 %.2f이고 %s이다\n",
				name,kaup,result);
	}
 
	/**
	 * @param scanner
	 */
	private static void calc(Scanner scanner) {
		
	}
}