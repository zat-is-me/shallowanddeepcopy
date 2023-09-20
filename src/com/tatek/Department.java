package com.tatek;

/**
 * @author tatek on 9/14/2023
 */
public class Department implements Cloneable{
    private String empId;
    private String grade;
    private String designation;

    public Department(String empId, String grade, String designation) {
        this.empId = empId;
        this.grade = grade;
        this.designation = designation;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Department{" +
                "empId='" + empId + '\'' +
                ", grade='" + grade + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
