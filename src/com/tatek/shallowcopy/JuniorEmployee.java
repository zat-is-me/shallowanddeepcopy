package com.tatek.shallowcopy;

import com.tatek.Department;

/**
 * @author tatek on 9/14/2023
 */

public class JuniorEmployee implements Cloneable{
    int id;
    String name;
    Department dept;

    public JuniorEmployee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    // Inorder to clone this object clone() method should be overridden in its class.
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
}
