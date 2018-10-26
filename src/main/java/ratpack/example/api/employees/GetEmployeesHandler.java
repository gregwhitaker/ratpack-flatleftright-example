package ratpack.example.api.employees;

import com.google.inject.Inject;
import ratpack.example.service.EmployeeService;
import ratpack.handling.Context;
import ratpack.handling.Handler;

public class GetEmployeesHandler implements Handler {

    @Inject
    private EmployeeService employeeService;

    @Override
    public void handle(Context ctx) throws Exception {

    }
}
