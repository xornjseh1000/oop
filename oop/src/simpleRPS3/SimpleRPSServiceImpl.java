package simpleRPS3;
/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :SimpleRPSService.java
 * @story  :
 */
 
 public class SimpleRPSServiceImpl implements SimpleRPSService{
	 SimpleRPSBean rps = new SimpleRPSBean();
 	@Override
 	public String playGame(int player) {
 		String result = "";
 		rps.setplay(player);
 		rps.setComp();
 		int com = rps.getcomp();
 		switch (player) {
 		case 1:
 			
 			switch (com) {
 			case 1: result = "TIE"; 
 			break;
 			case 2: result = "LOSE"; 
 			break;
 			case 3: result = "WIN"; 
 			break;
 			default:
 				break;
 			}
 			break;
 		case 2:
 			switch (com) {
 			case 1: result = "WIN"; 
 			break;
 			case 2: result = "TIE"; 
 			break;
 			case 3: result = "LOSE"; 
 			break;
 			default:
 				break;
 			}
 			break;
 		case 3:
 			switch (com) {
 			case 1: result = "LOSE"; 
 			break;
 			case 2: result = "WIN"; 
 			break;
 			case 3: result = "TIE"; 
 			break;
 			default:
 				break;
 			}
 			break;
 		default:
 			break;
 		}
 		return result;
 	}

	
	@Override
	public String getResult(String result) {
		
		return "플레이어는"+rps.getValue(rps.getplay())+"\n"+"컴퓨터 : "+rps.getValue(rps.getcomp())+"\n"+this.playGame(rps.getplay());
	}
 
 }