package com.tatek.deepcopy;

import com.tatek.Department;

/**
 * @author tatek on 9/14/2023
 */

public class SeniorEmployee implements Cloneable{
    int id;
    String name;
    Department dept;

    public SeniorEmployee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
    // Inorder to deep clone this object clone() method should be overridden and
    // need to specifier the properties in clone method which it should be copied.
    @Override
    public Object clone() throws CloneNotSupportedException {
        SeniorEmployee clone = (SeniorEmployee) super.clone();
        clone.setDept((Department) (clone.getDept().clone()));
        return clone;
    }

    @Override
    public String toString() {
        return "SeniorEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
