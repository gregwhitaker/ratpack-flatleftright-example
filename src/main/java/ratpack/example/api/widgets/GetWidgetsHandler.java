package ratpack.example.api.widgets;

import com.google.inject.Inject;
import ratpack.example.service.WidgetService;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.jackson.Jackson;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GetWidgetsHandler implements Handler {

    @Inject
    private WidgetService widgetService;

    @Override
    public void handle(Context ctx) throws Exception {
        widgetService.getAllWidgets()
                .then(widgets -> {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")
                            .withZone(ZoneId.systemDefault());

                    List<Widget> wgts = new ArrayList<>();

                    widgets.forEach(widget -> {
                        Widget w = new Widget();
                        w.setId(widget.getId());
                        w.setInspectorId(widget.getInspectorId());
                        w.setInspectionDate(dtf.format(widget.getInspectionDate()));

                        wgts.add(w);
                    });

                    Response response = new Response();
                    response.setWidgets(wgts);

                    ctx.render(Jackson.json(response));
                });
    }

    static class Response {
        private List<Widget> widgets;

        public List<Widget> getWidgets() {
            return widgets;
        }

        public void setWidgets(List<Widget> widgets) {
            this.widgets = widgets;
        }
    }

    static class Widget {
        private Integer id;
        private Integer inspectorId;
        private String inspectionDate;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getInspectorId() {
            return inspectorId;
        }

        public void setInspectorId(Integer inspectorId) {
            this.inspectorId = inspectorId;
        }

        public String getInspectionDate() {
            return inspectionDate;
        }

        public void setInspectionDate(String inspectionDate) {
            this.inspectionDate = inspectionDate;
        }
    }
}
