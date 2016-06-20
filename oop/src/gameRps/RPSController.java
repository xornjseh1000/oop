/**
 * 
 */
package gameRps;


import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :RPSController.java
 * @story  :
 */
public class RPSController {
		public static void main(String[] args) {
			RPSService service = new RpsServiceImpl();
			
			while (true) {
				switch (JOptionPane.showInputDialog("1계속0종료")) {
				case "1":			
					String rps = JOptionPane.showInputDialog("1가위2바위3보");
					if(service.checkValidation(rps)){
					service.betplayerValue(Integer.parseInt(rps));
					service.setComputerValue();
					service.whoWin();
					JOptionPane.showMessageDialog(null, service.showResult());
					}
					else{
						JOptionPane.showMessageDialog(null, "1~3 만가능 ");
					}
					break;

				default:
					break;
				}
				
			
				
				}
			}
		}
