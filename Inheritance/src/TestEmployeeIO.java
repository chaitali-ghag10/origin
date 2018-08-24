import com.pojo.Employee;

public class TestEmployeeIO {

	public static void main(String[] args) {
		/*EmployeeIOImpl emplImpl = new EmployeeIOImpl();
		
		Employee e = new Employee();
		
		e = emplImpl.readEmployee();
		emplImpl.writeEmployee(e);
			*/
		
		EmployeeIO empIO = new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				System.out.println(employee);
			}
			
			@Override
			public Employee readEmployee() {
				return new Employee();
			}
		};
		Employee emp = empIO.readEmployee();
		empIO.writeEmployee(emp);
			
		
	}

}
