package ratpack.example.data;

import com.google.inject.AbstractModule;
import ratpack.example.data.employee.EmployeeDao;
import ratpack.example.data.widget.WidgetDao;

public class DataModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(EmployeeDao.class);
        bind(WidgetDao.class);
    }
}
