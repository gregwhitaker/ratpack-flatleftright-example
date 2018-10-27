package ratpack.example.data.widget;

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
public class WidgetDao {

    private static final String SELECT_WIDGET_SQL = "SELECT * FROM widget WHERE widget_id = ?";
    private static final String SELECT_WIDGETS_SQL = "SELECT * FROM widget";
    private static final String SELECT_WIDGETS_INSPECTEDBY_SQL = "SELECT * FROM widget WHERE widget_inspector_id = ?";

    @Inject
    private DataSource dataSource;

    public Promise<Widget> find(Integer id) {
        return Blocking.get(() -> {
            try (Connection conn = dataSource.getConnection()) {
                try (PreparedStatement ps = conn.prepareStatement(SELECT_WIDGET_SQL)) {
                    ps.setInt(1, id);

                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            Widget widget = new Widget();
                            widget.setId(rs.getInt("widget_id"));
                            widget.setInspectorId(rs.getInt("widget_inspector_id"));
                            widget.setInspectionDate(rs.getTimestamp("widget_inspection_ts").toInstant());

                            return widget;
                        }
                    }
                }
            }

            return null;
        });
    }

    public Promise<List<Widget>> findAll() {
        return Blocking.get(() -> {
            try (Connection conn = dataSource.getConnection()) {
                try (PreparedStatement ps = conn.prepareStatement(SELECT_WIDGETS_SQL)) {
                    try (ResultSet rs = ps.executeQuery()) {
                        List<Widget> widgets = new ArrayList<>();

                        while (rs.next()) {
                            Widget widget = new Widget();
                            widget.setId(rs.getInt("widget_id"));
                            widget.setInspectorId(rs.getInt("widget_inspector_id"));
                            widget.setInspectionDate(rs.getTimestamp("widget_inspection_ts").toInstant());

                            widgets.add(widget);
                        }

                        return widgets;
                    }
                }
            }
        });
    }

    public Promise<List<Widget>> findAllInspectedBy(Integer employeeId) {
        return Blocking.get(() -> {
            try (Connection conn = dataSource.getConnection()) {
                try (PreparedStatement ps = conn.prepareStatement(SELECT_WIDGETS_INSPECTEDBY_SQL)) {
                    ps.setInt(1, employeeId);

                    try (ResultSet rs = ps.executeQuery()) {
                        List<Widget> widgets = new ArrayList<>();

                        while (rs.next()) {
                            Widget widget = new Widget();
                            widget.setId(rs.getInt("widget_id"));
                            widget.setInspectorId(rs.getInt("widget_inspector_id"));
                            widget.setInspectionDate(rs.getTimestamp("widget_inspection_ts").toInstant());

                            widgets.add(widget);
                        }

                        return widgets;
                    }
                }
            }
        });
    }
}
