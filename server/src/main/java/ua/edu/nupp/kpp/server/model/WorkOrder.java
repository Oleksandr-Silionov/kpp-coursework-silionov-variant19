package ua.edu.nupp.kpp.server.model;

import java.time.LocalDate;

public class WorkOrder {

    private Long id;
    private Long workRequestId;
    private String description;
    private LocalDate plannedDate;
    private LocalDate completedDate;
    private String executor;

    public WorkOrder() {
    }

    public WorkOrder(Long id, Long workRequestId,
                     String description, LocalDate plannedDate,
                     LocalDate completedDate, String executor) {
        this.id = id;
        this.workRequestId = workRequestId;
        this.description = description;
        this.plannedDate = plannedDate;
        this.completedDate = completedDate;
        this.executor = executor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkRequestId() {
        return workRequestId;
    }

    public void setWorkRequestId(Long workRequestId) {
        this.workRequestId = workRequestId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPlannedDate() {
        return plannedDate;
    }

    public void setPlannedDate(LocalDate plannedDate) {
        this.plannedDate = plannedDate;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }
}