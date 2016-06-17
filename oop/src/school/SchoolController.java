/**
 * 
 */
package school;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 16.
 * @author :김동혁
 * @file   :SchoolController.java
 * @story  :
 */
public class SchoolController {
	public static void main(String[] args) {
		Student student = null;
		
		while (true){
			switch (JOptionPane.showInputDialog("1,등록 2.조회 0.종료")) {
			case "1":
				
				String id = JOptionPane.showInputDialog("id");
				String pw = JOptionPane.showInputDialog("pw");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");
				student = new Student(id, pw, name, ssn, null);
				student.setpw(pw);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, student.getname()+student.getid()+student.getgender());
				break;
			case "0":
				return;

			default:
				break;
			}
		}
		
	}

}
