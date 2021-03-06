public class Employee {
	
	// Identity variables of Employee 
	private String empId;
	private String name;
	private double basic;
	private double allowancePercentage;
	private double hra;
	Roles role = new Roles();
	// Create getter and setter methods
	Employee(String empId, String name, int roleId, double basic, double allowancePercentage, double hra){
		this.empId = empId;
		this.name = name;
		this.role.setRoleId(roleId);
		this.basic = basic;
		this.allowancePercentage = allowancePercentage;
		this.hra = hra;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAllowancePercentage() {
		return this.allowancePercentage;
	}
	public void setAllowancePercentage(double allowancePercentage) {
		this.allowancePercentage = allowancePercentage;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getBasic() {
		return this.basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getSalary() {
		return SalaryCalculator.getSalary(this);
	}

	public double getAllowance() {
		return SalaryCalculator.getAllowance(this);
	}
}




















