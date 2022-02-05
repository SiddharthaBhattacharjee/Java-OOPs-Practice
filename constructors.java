package com.company;

class Emp{
    private int EmpID;
    private String EmpName;
    private int Salary;
    // This method is the constructor and hence it has the same name as the class
     public Emp(int id, String name, int salary){// arguments taken in this methods are set as attributes in the object
         EmpID = id;
         EmpName = name;
         Salary = salary;
     }
     public Emp(){// this is constructor overloading
         EmpID = 10000001;
         EmpName = "Default Name";
         Salary = 0;
     }
     public Emp(int id, String name){// This is also  constructor overloading
         EmpID = id;
         EmpName = name;
         Salary = 300000;
     }
     // These are other methods
     public void increment(int x){
         Salary += Salary*(x*0.01);
     }
     public String getEmpID(){
        String eid = EmpName.charAt(0)+ String.valueOf((int) (EmpID*69/420));
        return eid;
    }
    public int getSalary(){
         return Salary;
    }
}

public class constructors {
    public static void main(String[] args) {

        Emp harry = new Emp(16615120, "Harry Gupta", 600000);// using constructor to create the object
        harry.increment(10);
        System.out.println("EmpID : "+harry.getEmpID()+" , salary : "+harry.getSalary());

        Emp rohan = new Emp(12402266,"Rohan Das");
        System.out.println("EmpID : "+rohan.getEmpID()+" , salary : "+rohan.getSalary());

    }
}
