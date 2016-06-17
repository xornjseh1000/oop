/**
 * 
 */
package kaup;


import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 15.
 * @author :김동혁
 * @file   :KaupController.java
 * @story  :
 */
public class KaupController {
		public static void main(String[] args) {
			Kaup kaup = new Kaup();
			
			while (true) {
				switch (JOptionPane.showInputDialog("1: 실행 0:종료")) {
				case "1":
					String name = JOptionPane.showInputDialog("이름");
					String height = JOptionPane.showInputDialog("키");
					String weight = JOptionPane.showInputDialog("몸무게");
		//			JOptionPane.showMessageDialog(null, kaup.execute());
					kaup.setName(name);
			//		kaup.setHeight(height);
			//		kaup.setWeight(weight);
					break;

				default:
					JOptionPane.showConfirmDialog(null, "close OK?");
					return;
				}
				
			}
		}
}
