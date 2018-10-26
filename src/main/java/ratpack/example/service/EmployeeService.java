package ratpack.example.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import ratpack.example.data.employee.EmployeeDao;

@Singleton
public class EmployeeService {

    private final EmployeeDao employeeDao;

    @Inject
    public EmployeeService(final EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
