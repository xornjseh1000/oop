/**
 * 
 */
package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


/**
 * @date   :2016. 6. 24.
 * @author :김동혁
 * @file   :SBSMain.java
 * @story  :
 */
public class LottoBallMain {
		public static void main(String[] args) {
			LottoBallService ballService = new LottoBallServiceImpl();
			LottoBean lot = new LottoBean();
			StringBuffer buf = new StringBuffer();
			ballService.setLottoBall();
			
			int[] lotto = ballService.getLottoBall(); 
			
			for (int i = 0; i < lotto.length; i++) {
				Arrays.sort(lotto);	//LottoBallService 에서 씀
				buf.append(lotto[i] + " ");
			}
			
			System.out.println("로또\n" + buf);
			File output = new File("C:\\eclipse\\lotto\\lottoball.txt");
			BufferedWriter bw = null;
			String[] myLotto = buf.toString().split("/");

			try {
				bw = new BufferedWriter(new FileWriter(output, true));	// true는 파일을 오버라이딩하지말고 오버로딩...
				
				for(String lots : myLotto){
					lots += System.getProperty("line.separator");
					bw.write(lots);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.flush();	// 화장실 물내림
					bw.close(); // 화장실 문닫고 나감
				} catch (IOException e) {
					e.printStackTrace();
				}		
			}
		}
}
