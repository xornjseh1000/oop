/**
 * 
 */
package simpleRPS2;

import java.util.Random;

/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :SimpleRPSService.java
 * @story  :
 */
public interface SimpleRPSService {
	public abstract String playGame(String player); 
	public abstract String getResult(String result); 
}