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
		Account account = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1,통장계설2.입금 3조회 4출금 5통장내역 0,종료")) {
			case "1":
				int ok = JOptionPane.showConfirmDialog(null, "계좌계설 ?");
				if (ok == 0) {
					account = new Account(JOptionPane.showInputDialog("이름 "));
				} else {
					continue;
				
					
				}
				
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				account.setmoney(Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.getmoney());
				break;
			case "4": 
				
				break;
			case "5" :
				JOptionPane.showMessageDialog(null,MyConstants.BANK_NAME+",이름 :"+account.getname()+" 계좌번호 : "+ account.getAccountNo());
				break;
				
			
			default:
				JOptionPane.showConfirmDialog(null, "close OK?");
				return;
			}
		}
	}

}
