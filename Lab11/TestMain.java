public class TestMain {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of Employees");
		
		int n = Console.readInt();		
		
		Employee employees[] = new Employee[n];
		
		for(int i = 0; i < n; i++) {
			String empId,name;
			int roleId;
			double basic, allowance, hra;
			System.out.println("Name:");
			name = Console.readLine();
			System.out.println("EmpId:");
			empId = Console.readLine();
			System.out.println("RoleId:");
			roleId = Console.readInt();
			System.out.println("Basic:");
			basic = Console.readDouble();
			System.out.println("Allowance Percentage:");
			allowance = Console.readDouble();
			System.out.println("HRA:");
			hra = Console.readDouble();
			employees[i] = new Employee(empId,name,roleId,basic,allowance,hra);
		}

	// Assign objects of Employee to employees declared above
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport empReport = new EmployeeReport(dtReport);
	// Invoke display() method by passing the employee array
		
		empReport.display(employees);
		
	}		
}


















