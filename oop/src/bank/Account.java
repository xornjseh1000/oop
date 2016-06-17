package bank;

import java.util.Random;

/**
 * 
 */

/**
 * @date   :2016. 6. 16.
 * @author :김동혁
 * @file   :Account.java
 * @story  :
 */
public class Account {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다.
	private String name;
	private int money;
	
	private String pw;
	private String id;
	public final static String BANK_NAME="한빛은행";
	
	public Account(String name) {
		this.accountNo = (int) (Math.random() * 999999)+100000;
		this.name = name;
		
	}
	public void setaccountNo(){
		
		
	}
	public void setname(String name){
		
	}
	public void setmoney(int money){
		this.money = money;
	}
	
	public void setpw(String pw){
		this.pw = pw;
	}
	public void setid(String id){
		this.id = id;
	}
	public int getAccountNo() {
		return this.accountNo;
	}
	public String getname(){
		return this.name;
	}
	public int getmoney(){
		return this.money;
	}
	
	public String getpw(){
		return this.pw;
	}
	public String getid(){
		return this.id;
	}
}
