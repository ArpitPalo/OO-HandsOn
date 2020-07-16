public class ResultFinder {
	private int m1;
	private int m2;
	private int m3;
	private int total;
	private double average;
	// Create setter and getter methods 

	public void displayMarks() {
		System.out.println("Marks in subject 1 : " + getMarks1());
		System.out.println("Marks in subject 2 : " + getMarks2());
		System.out.println("Marks in subject 3 : " + getMarks3());
	
	}
	public int getTotal() {
//		complete the logic
		total = m1+m2+m3;
		return total;
	}
	public double getAverage() {
//		complete the logic
		average = total/3;
		return average;
	}
	
	public String getResult() {

//		complete the logic
		if(average >= 35) {
			if(average >= 60) {
				return "First Class!";
			}
			else if(average >= 50) {
				return "Second Class";
			}
			else {
				return "Pass!";
			}
		} else {
			return "Fail!";
		}
	}
	public int getMarks1() {
		return m1;
	}
	public void setMarks1(int m1) {
		this.m1 = m1;
	}
	public int getMarks2() {
		return m2;
	}
	public void setMarks2(int m2) {
		this.m2 = m2;
	}
	public int getMarks3() {
		return m3;
	}
	public void setMarks3(int m3) {
		this.m3 = m3;
	}
}
