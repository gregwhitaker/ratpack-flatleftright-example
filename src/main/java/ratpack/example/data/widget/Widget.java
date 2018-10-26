package ratpack.example.data.widget;

import java.time.Instant;

public class Widget {

    private Long id;
    private Integer inspectId;
    private Instant inspectDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
    }

    public Instant getInspectDate() {
        return inspectDate;
    }

    public void setInspectDate(Instant inspectDate) {
        this.inspectDate = inspectDate;
    }
}
