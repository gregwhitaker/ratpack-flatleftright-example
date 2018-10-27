package ratpack.example.data.widget;

import java.time.Instant;

public class Widget {

    private Integer id;
    private Integer inspectorId;
    private Instant inspectionDate;

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

    public Instant getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Instant inspectionDate) {
        this.inspectionDate = inspectionDate;
    }
}
