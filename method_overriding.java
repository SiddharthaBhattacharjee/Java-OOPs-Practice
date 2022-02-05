package com.company;

class A{
    public void method1(){
        System.out.println("I am Method 1");
    }
    public void method2(){
        System.out.println("I am method 2 of A");
    }
}

class B extends  A{
    public void method3(){
        System.out.println("I am Method 3");
    }
    @Override // in case something is changed in parent so that there is no longer overriding , it will give error
    public void method2(){
        System.out.println("I am method 2 of B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.method1();
        obj.method2();
        obj.method3();

        A obj2 = new A();
        obj2.method1();
        obj2.method2();
    }
}
