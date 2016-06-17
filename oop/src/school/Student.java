/**
 * 
 */
package school;

/**
 * @date   :2016. 6. 16.
 * @author :김동혁
 * @file   :Student.java
 * @story  : 
 * int age      String ssn , id, pw ,gender,name,regDate,
 * 1. 등록 : ssn , 아이디 , 비번 , 이름
 * 2. 조회 : 홍길동, 아이디 , 남
 */
public class Student {
	
	private String id;
	private String pw;
	private String name;
	private String regDate;
	private String ssn;
	private String gender;
	
	
	
	
	
	/**
	 * @param id2
	 * @param pw2
	 * @param name2
	 * @param ssn2
	 */
	public Student(String id, String pw, String name, String ssn,String gender) {
		// TODO Auto-generated constructor stub
		this.id= id;
		this.pw= pw;
		this.name= name;
		this.ssn=ssn;
		this.gender = gender;
		String[] arr = new String[2];
		arr=ssn.split("-");
		
		if (Integer.parseInt(arr[1])=='0' ||Integer.parseInt(arr[1]) =='9') {
		return;
		 
	}
	
	switch (Integer.parseInt(arr[1])%2) {
	case 1:
		this.gender = "남";
		break;
	default:
		this.gender ="여";
		break;}
	}
	public void setpw(String pw){
		this.pw=pw;
	}
	public void setregDate(String regDate){
		this.regDate = regDate;
	}
	
	public String getid(){
		return this.id;
	}
	public String getpw(){
		return this.pw;
	}
	public String getname(){
		return this.name;
	}
	public String getregDate(){
		return this.regDate;
		}
	public String getgender(){
		return this.gender;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번=******" +  ", 이름=" + name + ", 성별=" + regDate + ", 주민번호=" + ssn
				+ ", gender=" + gender +"]";
	}
	
	
	
	
	
	
	
	
	
}
