package ratpack.example.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import ratpack.example.data.widget.Widget;
import ratpack.example.data.widget.WidgetDao;
import ratpack.exec.Promise;

import java.util.List;

@Singleton
public class WidgetService {

    private final WidgetDao widgetDao;

    @Inject
    public WidgetService(final WidgetDao widgetDao) {
        this.widgetDao = widgetDao;
    }

    public Promise<Widget> getWidget(Integer id) {
        return widgetDao.find(id);
    }

    public Promise<List<Widget>> getAllWidgets() {
        return widgetDao.findAll();
    }

    public Promise<List<Widget>> getAllWidgetsInspectedBy(Integer employeeId) {
        return widgetDao.findAllInspectedBy(employeeId);
    }
}
