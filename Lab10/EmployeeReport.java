public class EmployeeReport {
	private String dtReport;
	
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		// Complete the logic 
		for(int i = 0; i < empArr.length; i++) {
			Employee emp = empArr[i];
			System.out.print(emp.getEmpId() + "\t" + emp.getName() + "\t" + emp.role.roleBuilder.getRoleDescription(emp.role.getRoleId()));
			System.out.print("\t" + emp.getBasic() + "\t" + emp.getHra() + "\t" + emp.getAllowance() + "\t" + emp.getSalary());
			System.out.println();
		}
		
		displayFooter(empArr.length);
		
	}
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}