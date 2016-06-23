/**
 * 
 */
package grade;

/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :GradeServiceImpl.java
 * @story  :
 */
public  class GradeServiceImpl implements GradeService {
	@Override
	public int total(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}
	@Override
	public int avg(int total) {
		int avg = total / 3;
		return avg;
	}
	@Override
	public String grade(int avg) {
		String grade = "";
		switch (avg/10) {
		case 9:
			 grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
			
			
		default:
			grade = "F";
			break;
		}
		return grade;
	}
}
