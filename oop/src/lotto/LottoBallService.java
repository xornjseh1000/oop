/**
 * 
 */
package lotto;

/**
 * @date   :2016. 6. 24.
 * @author :김동혁
 * @file   :LottoBallService.java
 * @story  :
 */
public interface LottoBallService {
	public void setLottoBall(LottoBean lot);
	public int[] getLottoBall();
	public boolean isDuplication(int num);
}
