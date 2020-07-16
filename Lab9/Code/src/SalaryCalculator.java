public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		
	// Complete the logic
		salary = emp.getHra() + emp.getBasic() + emp.getAllowance();
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = 0.0;

	// Complete the logic
		allowance = emp.getAllowance();
		return allowance;
	}
}
