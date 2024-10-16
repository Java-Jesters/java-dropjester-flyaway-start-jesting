package org.example.models;

import java.sql.Date;

public class Project {
    private int projectId;
    private String name;
    private double projectValue;
    private int clientId;
    private int techLeadId;
    private int salesEmployeeId;
    private ProjectDate projectDate;

    public Project(final int projectId,
                   final String name,
                   final float projectValue,
                   final int clientId,
                   final int techLeadId,
                   final int salesEmployeeId,
                   final ProjectDate projectDate
    ) {
        this.projectId = projectId;
        this.name = name;
        this.projectValue = projectValue;
        this.clientId = clientId;
        this.techLeadId = techLeadId;
        this.salesEmployeeId = salesEmployeeId;
        this.projectDate = projectDate;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(final int projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getProjectValue() {
        return projectValue;
    }

    public void setProjectValue(final double projectValue) {
        this.projectValue = projectValue;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(final int clientId) {
        this.clientId = clientId;
    }

    public int getTechLeadId() {
        return techLeadId;
    }

    public void setTechLeadId(final int techLeadId) {
        this.techLeadId = techLeadId;
    }

    public int getSalesEmployeeId() {
        return salesEmployeeId;
    }

    public void setSalesEmployeeId(final int salesEmployeeId) {
        this.salesEmployeeId = salesEmployeeId;
    }

    public Date getStartDate() {
        return projectDate.getStartDate();
    }

    public void setStartDate(final Date startDate) {
        this.projectDate.setStartDate(startDate);
    }

    public Date getFinishDate() {
        return projectDate.getFinishDate();
    }

    public void setFinishDate(final Date finishDate) {
        this.projectDate.setFinishDate(finishDate);
    }
}
