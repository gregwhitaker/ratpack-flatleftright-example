package ratpack.example.data.employee;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import ratpack.exec.Blocking;
import ratpack.exec.Promise;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class EmployeeDao {

    private static final String SELECT_EMPLOYEE_SQL = "SELECT * FROM employee WHERE employee_id = ?";
    private static final String SELECT_EMPLOYEES_SQL = "SELECT * FROM employee";

    @Inject
    private DataSource dataSource;

    public Promise<Employee> find(Integer id) {
        return Blocking.get(() -> {
            try (Connection conn = dataSource.getConnection()) {
                try (PreparedStatement ps = conn.prepareStatement(SELECT_EMPLOYEE_SQL)) {
                    ps.setInt(1, id);

                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            Employee employee = new Employee();
                            employee.setId(rs.getInt("employee_id"));
                            employee.setFirstName(rs.getString("employee_firstname"));
                            employee.setLastName(rs.getString("employee_lastname"));

                            return employee;
                        }
                    }
                }
            }

            return null;
        });
    }

    public Promise<List<Employee>> findAll() {
        return Blocking.get(() -> {
            try (Connection conn = dataSource.getConnection()) {
                try (PreparedStatement ps = conn.prepareStatement(SELECT_EMPLOYEES_SQL)) {
                    try (ResultSet rs = ps.executeQuery()) {
                        List<Employee> employees = new ArrayList<>();

                        while(rs.next()) {
                            Employee employee = new Employee();
                            employee.setId(rs.getInt("employee_id"));
                            employee.setFirstName(rs.getString("employee_firstname"));
                            employee.setLastName(rs.getString("employee_lastname"));

                            employees.add(employee);
                        }

                        return employees;
                    }
                }
            }
        });
    }
}
