package com.assignment.collections.EmployeeManagement;

public class MainClass {
    public static  void main(String args[]) {
        EmployeeDB edb = new EmployeeDB();


        Employee e1 = new Employee(1, "deeepthi", "dtchokka@gmail.com", 'f', 123456);
        boolean val = edb.addEmployee(e1);
        System.out.println(val);

        edb.deleteEmployee(1);

        edb.listAll();
    }
}
