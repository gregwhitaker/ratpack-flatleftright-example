package ratpack.example.data;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import ratpack.example.data.employee.EmployeeDao;
import ratpack.example.data.widget.WidgetDao;

import javax.sql.DataSource;

public class DataModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(EmployeeDao.class);
        bind(WidgetDao.class);
    }

    @Singleton
    @Provides
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("org.h2.jdbcx.JdbcDataSource");
        hikariConfig.setJdbcUrl("jdbc:h2:./build/database");
        hikariConfig.setConnectionTestQuery("VALUES 1");
        hikariConfig.setUsername("sa");
        hikariConfig.setPassword("sa");

        return new HikariDataSource(hikariConfig);
    }
}
