package com.tatek;

import com.tatek.deepcopy.SeniorEmployee;
import com.tatek.shallowcopy.JuniorEmployee;

/**
 * @author tatek on 9/14/2023
 */

//To copy an object of the class, three things must be done
    //one, implement Cloneable interface to the class,
    //two, override clone() method in the class and
    //three; It needs to be type cast the newly created object.
//The clone method creates copies of all the fields and assigns
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept1 = new Department ("1", "A", "Earth");
        Department dept2 = new Department ("1", "A", "Earth");
        SeniorEmployee seniorEmployee = new SeniorEmployee(111, "John", dept1);
        JuniorEmployee juniorEmployee = new JuniorEmployee(222,"Ahmed",dept2);

        shallowCopy(juniorEmployee);
        deepCopy(seniorEmployee);
    }

    private static void shallowCopy(JuniorEmployee juniorEmployee) throws CloneNotSupportedException {
        JuniorEmployee juniorEmployeeCopy =(JuniorEmployee) juniorEmployee.clone();
        System.out.println("Shallow copy\nOriginal object value before change: "+juniorEmployee.getDept().getDesignation());
        juniorEmployeeCopy.getDept().setDesignation("Mars ...");
        System.out.println("Original object value after change: "+juniorEmployee.getDept().getDesignation());
    }

    private static void deepCopy(SeniorEmployee seniorEmployee) throws CloneNotSupportedException {
        SeniorEmployee seniorEmployeeCopy = (SeniorEmployee) seniorEmployee.clone();
        System.out.println("Deep Copy\nOriginal object value before change: "+seniorEmployeeCopy.getDept().getDesignation());
        seniorEmployeeCopy.getDept().setDesignation("Mars ...");
        // This change was not reflected on the original object
        System.out.println("Original object value after change: "+seniorEmployee.getDept().getDesignation());
    }
}