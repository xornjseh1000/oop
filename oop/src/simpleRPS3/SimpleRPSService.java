/**
 * 
 */
package simpleRPS3;


/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :SimpleRPSService.java
 * @story  :
 */
public interface SimpleRPSService {
	public abstract String playGame(int player); 
	public abstract String getResult(String result); 
}