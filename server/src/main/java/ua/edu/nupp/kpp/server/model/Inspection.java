package ua.edu.nupp.kpp.server.model;

import java.time.LocalDate;

public class Inspection {

    private Long id;
    private Long treeId;
    private LocalDate inspectionDate;
    private Integer conditionScore;
    private String notes;

    public Inspection() {
    }

    public Inspection(Long id, Long treeId, LocalDate inspectionDate,
                      Integer conditionScore, String notes) {
        this.id = id;
        this.treeId = treeId;
        this.inspectionDate = inspectionDate;
        this.conditionScore = conditionScore;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Integer getConditionScore() {
        return conditionScore;
    }

    public void setConditionScore(Integer conditionScore) {
        this.conditionScore = conditionScore;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}