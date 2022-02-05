package com.company;

class myEmployee{
    private String e_name;
    private String e_sName;
    private int e_regNo;
    private int e_salary;
    // we cant give access of employees name and regNo to anyone... private helps wth that
    // we cant let anyone modify salary , private helps with that too
    public void set(String name, String surName, int regNo, int salary){
        if(e_name != null || e_sName != null || e_salary != 0 || e_regNo != 0){
            System.out.println("Data already set and cannot be modified");
        }
        else {
            e_name = name;
            e_sName = surName;
            e_regNo = regNo;
            e_salary = salary;
        }
    }
    public String getEmpID(){
        String id = e_name.charAt(0)+e_sName.substring(0,1)+((int)(((e_regNo*7/5)+420)/69));
        return id;
    }
    public void increment(int i){
        e_salary += e_salary*(i*0.01);
    }
    public int getSalary(){
        return e_salary;
    }
}

public class private_modifier {
    public static void main(String[] args) {
        myEmployee e1 = new myEmployee();
        myEmployee e2 = new myEmployee();

        e1.set("Harry","Gupta", 2140621, 600000);
        System.out.println("EmpID of e1 : "+e1.getEmpID());
        e1.increment(10);
        System.out.println("Salary : "+e1.getSalary());

        e2.set("Rohan", "Das", 6561669, 600000);
        System.out.println("EmpID of e2 : "+e2.getEmpID());
        System.out.println("Salary : "+e2.getSalary());
    }
}
