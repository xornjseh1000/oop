/**
 * 
 */
package gameRps;

/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :RpsServiceImpl.java
 * @story  :
 */
public class RpsServiceImpl implements RPSService {
	
	RPSBean rps;
	
	@Override
	public void betplayerValue(int playervalue) {
		playervalue = new RPSBean;
	}

	@Override
	public void setComputerValue() {
		int setComputerValue = (int) (Math.random() * 3 + 1);
	}

	@Override
	public void whoWin() {
		
	}

	@Override
	public String showResult() {
		return null;
	}

	@Override
	public boolean checkValidation(String rps) {
		return false;
	}
	
}
