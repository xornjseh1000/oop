package simpleRPS2;
/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :SimpleRPSService.java
 * @story  :
 */

 
 import javax.swing.JOptionPane;
 
 public class SimpleRPSController {
 	public static void main(String[] args) {
 		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
 		SimpleRPSService service = new SimpleRPSServiceImpl();
 		while (true) {
 			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
 			case 0:
 				JOptionPane.showMessageDialog(null, service.getResult(service.playGame(JOptionPane.showInputDialog("1가위2바위3보"))));
 				break;
 			default:
 				return;
 			}
 		}
 	}
 }
