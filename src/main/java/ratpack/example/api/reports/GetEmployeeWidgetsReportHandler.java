package ratpack.example.api.reports;

import com.google.inject.Inject;
import ratpack.example.service.EmployeeService;
import ratpack.example.service.WidgetService;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.jackson.Jackson;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GetEmployeeWidgetsReportHandler implements Handler {

    @Inject
    private EmployeeService employeeService;

    @Inject
    private WidgetService widgetService;

    @Override
    public void handle(Context ctx) throws Exception {
        Integer employeeId = Integer.parseInt(ctx.getAllPathTokens().get("employeeId"));

        employeeService.getEmployee(employeeId)
                .flatRight(employee -> widgetService.getAllWidgetsInspectedBy(employeeId))
                .then(pair -> {
                    Response response = new Response();
                    response.employeeId = pair.left.getId();
                    response.firstName = pair.left.getFirstName();
                    response.lastName = pair.left.getLastName();

                    pair.right.forEach(widget -> {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").withZone(ZoneId.systemDefault());

                        InspectedWidgetResponse inspectedWidgetResponse = new InspectedWidgetResponse();
                        inspectedWidgetResponse.widgetId = widget.getId();
                        inspectedWidgetResponse.inspectionDate = dtf.format(widget.getInspectionDate());

                        response.addInspectedWidget(inspectedWidgetResponse);
                    });

                    ctx.render(Jackson.json(response));
                });
    }

    static class Response {
        public Integer employeeId;
        public String firstName;
        public String lastName;
        public List<InspectedWidgetResponse> inspectedWidgets = new ArrayList<>();

        public void addInspectedWidget(InspectedWidgetResponse inpsectedWidget) {
            this.inspectedWidgets.add(inpsectedWidget);
        }
    }

    static class InspectedWidgetResponse {
        public Integer widgetId;
        public String inspectionDate;
    }
}
