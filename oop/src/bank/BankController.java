/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import global.MyConstants;

/**
 * @date   :2016. 6. 15.
 * @author :김동혁
 * @file   :accountController.java
 * @story  :
 */
public class BankController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		
		while (true) {
			switch (JOptionPane.showInputDialog("1,통장계설2.입금 3조회 4출금 5통장내역 0,종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,id,pw");
				String[] specArr = spec.split(",");
				service.openAccount(specArr[0],specArr[1],specArr[2]);
				
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
				//JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4": 
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				;
				JOptionPane.showMessageDialog(null,service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5" :
				JOptionPane.showMessageDialog(null,service.showAccount());
				
				break;
			//case "6":
			//	public void deleteAccount(){
			//		account = null;
			//	}
			
			
			default:
				JOptionPane.showConfirmDialog(null, "close OK?");
				return;
			}
		}
	}

}
