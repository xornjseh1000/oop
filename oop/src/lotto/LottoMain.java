/**
 * 
 */
package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 23.
 * @author :김동혁
 * @file   :LottoController.java
 * @story  :
 */
public class LottoMain {
		public static void main(String[] args) {
			LottoBean lot = new LottoBean();
			LottoService service = new LottoServiceImpl();
			StringBuffer buf = new StringBuffer();
			JOptionPane.showInputDialog("얼마치 구입?");
			lot.setMoney(5800);
			service.setLottos(lot);
			int[][] lottos = service.getLottos();
			for (int i = 0; i < lottos.length; i++) {
				service.sort(lottos[i]);
				for (int j = 0; j < lottos[i].length; j++) {
					buf.append(lottos[i][j]+"\t");
				}
				buf.append("/n");
			}
			System.out.println("로또\n"+buf);
			int lottoSerialNo = (int) (Math.random()*999999+100000);
			File output = new File("c:\\eclipse\\lotto\\"+lottoSerialNo+".txt");
			BufferedWriter bw=null;
			String[] myLotto = buf.toString().split("/");
			
			try {
				bw = new BufferedWriter( new FileWriter(output,true));// 뒤에 true 는 이어써라.
				
				for(String lots : myLotto){
					lots += System.getProperty("line.separator");
					bw.write(lots);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					bw.flush(); //화장실에서 물내리는거
					bw.close(); //화장실에서 문닫고 나가는거
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			
			
			
			
			
			
		}
}

