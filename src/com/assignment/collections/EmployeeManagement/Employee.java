package com.assignment.collections.EmployeeManagement;

public class Employee {
    private int Empid;
    private String EmpName;
    private String EmpEmail;
    private char EmpGender;
    private float EmpSalary;

    public Employee(int empid, String empName, String empEmail, char empGender, float empSalary) {
        Empid = empid;
        EmpName = empName;
        EmpEmail = empEmail;
        EmpGender = empGender;
        EmpSalary = empSalary;
    }

    public Employee() {
        Empid = 0;
        EmpName = "XXX";
        EmpEmail = "XXX@gmail.com";
        EmpGender = 'F';
        EmpSalary = 0 ;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String empEmail) {
        EmpEmail = empEmail;
    }

    public char getEmpGender() {
        return EmpGender;
    }

    public void setEmpGender(char empGender) {
        EmpGender = empGender;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(float empSalary) {
        EmpSalary = empSalary;
    }

    public void GetEmployeeDetails(){
        System.out.println("Printing the details of the employee");
        System.out.println("Employee ID:"+Empid +"\nEmployee Name:" +EmpName
                +"\nEmployee Email ID:" +EmpEmail +"\nEmployee Gender:" +EmpGender
                +"\nEmployee Salary" +EmpSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Empid=" + Empid +
                ", EmpName='" + EmpName + '\'' +
                ", EmpEmail='" + EmpEmail + '\'' +
                ", EmpGender=" + EmpGender +
                ", EmpSalary=" + EmpSalary +
                '}';
    }
}
