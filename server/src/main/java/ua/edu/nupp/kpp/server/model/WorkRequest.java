package ua.edu.nupp.kpp.server.model;

public class WorkRequest {

    private Long id;
    private Long inspectionId;
    private String description;
    private String state;
    private Double f1;
    private Double f2;
    private Double f3;
    private Double riskIndex;

    public WorkRequest() {
    }

    public WorkRequest(Long id, Long inspectionId, String description,
                       String state, Double f1, Double f2,
                       Double f3, Double riskIndex) {
        this.id = id;
        this.inspectionId = inspectionId;
        this.description = description;
        this.state = state;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.riskIndex = riskIndex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Long inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getF1() {
        return f1;
    }

    public void setF1(Double f1) {
        this.f1 = f1;
    }

    public Double getF2() {
        return f2;
    }

    public void setF2(Double f2) {
        this.f2 = f2;
    }

    public Double getF3() {
        return f3;
    }

    public void setF3(Double f3) {
        this.f3 = f3;
    }

    public Double getRiskIndex() {
        return riskIndex;
    }

    public void setRiskIndex(Double riskIndex) {
        this.riskIndex = riskIndex;
    }
}