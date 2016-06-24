/**
 * 
 */
package collection;

import java.util.List;
import java.util.Vector;

import school.StudentBean;

/**
 * @date   :2016. 6. 23.
 * @author :김동혁
 * @file   :ListEx.java
 * @story  :
 */
public class VectorEx {
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>();
		StudentBean searchMan = new StudentBean();
		StudentBean hong= new StudentBean("hong", "1","홍길동", "800101-1");
		StudentBean kim= new StudentBean("kim", "1","김유신", "900101-1");
		StudentBean lee= new StudentBean("lee", "1","이순신", "010101-3");
		
		//System.out.println("size : "+v.size());
		
		//자원추가
		v.add(hong);
		v.add(kim);
		v.add(lee);
		
		//System.out.println("size :"+v.size());
		//System.out.println(v.toString());
		String searchName = "333"; 
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getName().equals(searchName)) {
				searchMan = v.get(i);
				
				
			} 
		}
		if (searchMan.getId() == null) {
			System.out.println(searchName + "라는 이름은 없습니다.");
		} 	else {
			System.out.println(searchMan.toString());
		} 
		if (!searchName.equals(searchMan.getName())) {
			System.out.println(searchName + "라는 이름은 없습니다.");
		} 	else {
			System.out.println(searchMan.toString());
		}	
		searchMan.setName("홍길동");
		if (v.contains(searchMan.getName())) {
			v.remove(v.indexOf(searchMan));
		}else{
			System.out.println("존재X");
		}
				System.out.println(v.size());
				
		}
	
}
