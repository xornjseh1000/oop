/**
 * 
 */
package lotto;

/**
 * @date :2016. 6. 24.
 * @author :김동혁
 * @file :LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService {
	private int[] lottoBall;
	int num[] = new int[6];

	@Override
	public boolean isDuplication(int num) {
		// 중복방지(완성)
		for (int i = 0; i < lottoBall.length; i++) {
			if (lottoBall[i] == num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void setLottoBall() {
		LottoBean lot = new LottoBean();
		int num = lot.getNumber();
		this.lottoBall = new int[6];
		
		int i = 0;
		
		while (true) {
			// 0 대신 식을 채우시오
			if (isDuplication(num)) { // 조건문을 채우시오
				continue;
			}
			this.lottoBall[i] = num;
			i++;
			if (i == lottoBall.length) { // if문을 완성하시오
				break;
			}

		}
	}

	@Override
	public int[] getLottoBall() {
		return lottoBall;
	}

}
