package com.assignment.collections.EmployeeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeDB {

    ArrayList<Employee> emp1=new ArrayList<Employee>();
    Iterator it1 = emp1.iterator();
    TreeSet<Employee> emp2=new TreeSet<Employee>();
    Iterator it2 = emp2.iterator();

    public boolean addEmployee(Employee e){
        try {
            emp1.add(e);
            emp2.add(e);
            return true;
        }
        catch(Exception exception){
            System.out.println(exception);
            return false;
        }
    }

//    public boolean deleteEmployee(int empId){
//        for
//        if(getEmpid==empId)
//
//    }
//
//    public String showPaySlip(int empId){
//
//    }

    public void listAll(){
        Iterator i= emp2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
