/**
 * 
 */
package gameRps;

/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :RPSBean.java
 * @story  :
 */
public class RPSBean {
		private String play,comp;
		
		public void setplay(String play){
			switch (play) {
			case "1":
				this.play = "가위";
				break;

			default:
				break;
			}
			this.play = play;
		}
		public void setComp(String comp){
			this.comp = comp;
		}
		
		
		
		public String getcomp(){
			return this.comp;
		}
		public String getplay(){
			return this.play;
		}
		
		
		
		
		
		
		@Override
		public String toString() {
			return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + "]";
		}
		
}
