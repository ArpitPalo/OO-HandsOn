public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		emp.setEmpID(empId);
		
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		emp.setEmpName(name);
		
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();
		emp.address.setAddressLine1(addrLine1);
		
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		emp.address.setAddressLine2(addrLine2);
		
		System.out.println("Address City : ");
		String city = Console.readLine();
		emp.address.setCity(city);
		
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		emp.address.setPin(pin);
		


	}
	public static void showData(Employee emp) {
		
		System.out.println("Emp Id : ");
		System.out.println(emp.getEmpID());
		System.out.println("Name : ");
		System.out.println(emp.getEmpName());
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : ");
		System.out.println(emp.address.getAddressLine1());
		System.out.println("Addr Line2 : ");
		System.out.println(emp.address.getAddressLine2());
		System.out.println("City : ");
		System.out.println(emp.address.getCity());
		System.out.println("Pin : ");
		System.out.println(emp.address.getPin());
		System.out.println("--------------------------------------------");

		


	}
}














