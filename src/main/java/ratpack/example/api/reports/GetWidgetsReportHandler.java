package ratpack.example.api.reports;

import com.google.inject.Inject;
import ratpack.example.service.WidgetService;
import ratpack.handling.Context;
import ratpack.handling.Handler;

public class GetWidgetsReportHandler implements Handler {

    @Inject
    private WidgetService widgetService;

    @Override
    public void handle(Context ctx) throws Exception {

    }
}
