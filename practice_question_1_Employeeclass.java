package com.company;

class Employees{
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class practice_question_1_Employeeclass {
    public static void main(String[] args) {
        //instantiating objects
        Employees emp1 = new Employees();
        Employees emp2 = new Employees();

        // setting attributes
        emp1.name = "Harry";
        emp1.salary = 600000;

        emp2.name = "Rohan";
        emp2.salary = 600000;

        //using class methods
        emp2.setName("Rohan Das");
        emp1.setName("Harry Gupta");

        if(emp1.getSalary()> emp2.getSalary()){
            System.out.println("Salary difference is : "+(emp1.getSalary()-emp2.getSalary())+" & "+emp1.getName()+" has higher salary!");
        }
        else if(emp2.getSalary()>emp1.getSalary()){
            System.out.println("Salary difference is : "+(emp2.getSalary()-emp1.getSalary())+" & "+emp2.getName()+" has higher salary!");
        }
        else{
            System.out.println("Both "+emp1.getName()+" & "+emp2.getName()+" has same salary!");
        }

    }
}
