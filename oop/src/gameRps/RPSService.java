/**
 * 
 */
package gameRps;

/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :RPSService.java
 * @story  :
 */
public interface RPSService {
		public void betplayerValue(int playervalue);
		public void setComputerValue();
		public void whoWin();
		public String showResult();
		public boolean checkValidation(String rps); //유효성 체크
}
