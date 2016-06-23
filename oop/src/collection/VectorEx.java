/**
 * 
 */
package collection;

import java.util.List;
import java.util.Vector;

/**
 * @date   :2016. 6. 23.
 * @author :김동혁
 * @file   :ListEx.java
 * @story  :
 */
public class VectorEx {
	public static void main(String[] args) {
		List<String> v = new Vector<String>();
		System.out.println("::::::::::::Vector생성시::::::::::::");
		System.out.println("size : "+v.size());
		
		//자원추가
		v.add("박지성");
		v.add("박주영");
		v.add("유상철");
		
		System.out.println("::::::::::::::::::::요소추가후:::::::::::::::::::::::");
		System.out.println("size :"+v.size());
	
	}
}
