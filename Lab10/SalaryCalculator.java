public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		
	// Complete the logic
		salary = emp.getHra() + emp.getBasic() + getAllowance(emp);
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowancePercentage = 0.0;

	// Complete the logic
		allowancePercentage = emp.getAllowancePercentage();
		double allowance = (allowancePercentage*emp.getBasic())/100;
		return allowance;
	}
}
