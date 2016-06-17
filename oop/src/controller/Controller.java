/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 15.
 * @author :김동혁
 * @file   :Controller.java
 * @story  :
 */
public class Controller {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Calc calc = new Calc();
			while (true) {
				System.out.println("[메뉴]"
						+ "1.계산기 "
						+ "2.카우푸 "
						+ "0.종료");
				switch (s.next()) {
				case "1":
					System.out.println("num1, opcode, num2 입력바람");
					System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
					
					break;
				case "2":break;
				case "0":
					JOptionPane.showConfirmDialog(null, "Closing OK?");
					return;
					

				default:
					break;
				}
			}
		}
}
