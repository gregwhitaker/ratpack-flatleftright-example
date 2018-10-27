package ratpack.example.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import ratpack.example.data.employee.Employee;
import ratpack.example.data.employee.EmployeeDao;
import ratpack.exec.Promise;

import java.util.List;

@Singleton
public class EmployeeService {

    private final EmployeeDao employeeDao;

    @Inject
    public EmployeeService(final EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Promise<Employee> getEmployee(Integer id) {
        return employeeDao.find(id);
    }

    public Promise<List<Employee>> getAllEmployees() {
        return employeeDao.findAll();
    }
}
