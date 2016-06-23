package simpleRPS2;
/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :SimpleRPSService.java
 * @story  :
 */
 import java.util.Random;
 
 public class SimpleRPSServiceImpl implements SimpleRPSService{
 
 	@Override
 	public String playGame(String player) {
 		Random r = new Random();
 		String result = "";
 		switch (player) {
 		case "1":
 			switch (r.nextInt(3)+1) {
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
 		case "2":
 			switch (r.nextInt(3)+1) {
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
 		case "3":
 			switch (r.nextInt(3)+1) {
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
		
		return "플레이어는"+result;
	}
 
 }