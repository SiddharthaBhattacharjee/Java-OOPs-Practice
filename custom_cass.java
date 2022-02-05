package com.company;

class Employee{
    int id;
    String name;
    int salary = 600000;

    public void increment(int p){
        salary += salary*(p*0.01);
    }

    public void printSalary(){
        System.out.println("ID : "+id+" , Salary : "+salary);
    }

    public int getSalary(){
        return salary;
    }

    public void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
    }
}
public class custom_cass {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        // instantiating an object
        Employee harry = new Employee();
        Employee john = new Employee();
        // setting attributes
        harry.id = 1001;
        harry.name = "Code With Harry";
        john.name = "John Cena";
        john.id = 1002;
        //running class methods
        harry.printDetails();
        john.printDetails();

        harry.increment(10);
        harry.printSalary();
        john.printSalary();

        int x = harry.getSalary();
        int y = john.getSalary();
        if(x>=y){
            System.out.println("Salary difference is : "+(x-y));
        }
        else{
            System.out.println("Salary difference is : "+(y-x));
        }

    }
}
