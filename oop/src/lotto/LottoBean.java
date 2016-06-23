/**
 * 
 */
package lotto;


/**
 * @date   :2016. 6. 23.
 * @author :김동혁
 * @file   :LottoBean.java
 * @story  :
 */
public class LottoBean {
	private int money = 0,number = 0;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber() {
		
		this.number = (int) (Math.random()*45)+1;  // 로또를 구성하는 랜덤 숫자 하나 발생
		
	}

	
	@Override
	public String toString() {
		return "LottoBean [money=" + money + ", number=" + number + "]";
	}
	
}
