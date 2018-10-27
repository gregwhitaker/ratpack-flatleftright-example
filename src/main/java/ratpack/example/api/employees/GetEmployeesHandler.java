package ratpack.example.api.employees;

import com.google.inject.Inject;
import ratpack.example.data.employee.Employee;
import ratpack.example.service.EmployeeService;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.jackson.Jackson;

import java.util.List;

public class GetEmployeesHandler implements Handler {

    @Inject
    private EmployeeService employeeService;

    @Override
    public void handle(Context ctx) throws Exception {
        employeeService.getAllEmployees()
                .then(employees -> {
                    Response response = new Response();
                    response.setEmployees(employees);

                    ctx.render(Jackson.json(response));
                });
    }

    static class Response {
        private List<Employee> employees;

        public List<Employee> getEmployees() {
            return employees;
        }

        public void setEmployees(List<Employee> employees) {
            this.employees = employees;
        }
    }
}
