package ratpack.example.api;

import ratpack.example.api.employees.GetEmployeesHandler;
import ratpack.example.api.reports.GetEmployeeWidgetsReportHandler;
import ratpack.example.api.widgets.GetWidgetsHandler;
import ratpack.func.Action;
import ratpack.handling.Chain;

public class ApiHandlers implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {

        chain.get("api/v1/employees", GetEmployeesHandler.class);

        chain.get("api/v1/widgets", GetWidgetsHandler.class);

        chain.prefix("api/v1/reports", c -> {
           c.get("employees/:employeeId/widgets", GetEmployeeWidgetsReportHandler.class);
        });
    }
}
