package ratpack.example.api;

import com.google.inject.AbstractModule;
import ratpack.example.api.employees.GetEmployeesHandler;
import ratpack.example.api.reports.GetEmployeeWidgetsReportHandler;
import ratpack.example.api.widgets.GetWidgetsHandler;

public class ApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiHandlers.class);

        bind(GetEmployeesHandler.class);
        bind(GetWidgetsHandler.class);
        bind(GetEmployeeWidgetsReportHandler.class);
    }
}
