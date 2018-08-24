import com.pojo.Employee;

public interface EmployeeIO {
	double PI = 3.14;
	public static final String NAME = "CITI";

	Employee readEmployee();
    void writeEmployee(Employee employee);
}
