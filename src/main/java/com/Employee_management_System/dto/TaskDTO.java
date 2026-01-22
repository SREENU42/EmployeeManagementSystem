package com.example.ems.dto;

public class TaskDTO {
    private String title;
    private String status;
    private Long employeeId; // Link task to an employee

    // Constructors
    public TaskDTO() {}

    public TaskDTO(String title, String status, Long employeeId) {
        this.title = title;
        this.status = status;
        this.employeeId = employeeId;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }
}
