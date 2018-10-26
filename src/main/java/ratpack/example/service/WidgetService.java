package ratpack.example.service;

import com.google.inject.Inject;
import ratpack.example.data.widget.WidgetDao;

public class WidgetService {

    private final WidgetDao widgetDao;

    @Inject
    public WidgetService(final WidgetDao widgetDao) {
        this.widgetDao = widgetDao;
    }
}
