package ratpack.example.api;

import ratpack.example.api.employees.GetEmployeesHandler;
import ratpack.example.api.reports.GetWidgetsReportHandler;
import ratpack.example.api.reports.GetEmployeeWidgetsReportHandler;
import ratpack.func.Action;
import ratpack.handling.Chain;

public class ApiHandlers implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {

        chain.get("api/v1/employees", GetEmployeesHandler.class);

        chain.prefix("api/v1/reports", c -> {
           c.get("widgets", GetWidgetsReportHandler.class);
           c.get("employees/:employeeId/widgets", GetEmployeeWidgetsReportHandler.class);
        });
    }
}
