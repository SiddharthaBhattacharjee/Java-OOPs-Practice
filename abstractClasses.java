package com.company;

abstract class parent{
    public void hello(){
        System.out.println("Hello");
    }
    abstract void greet();
}

class child1 extends parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void nextLine(){
        System.out.println("How are you?");
    }
}

class child2 extends parent{
    @Override
    public void greet() {
        System.out.println("Good night");
    }
    public void byee(){
        System.out.println("See you soon");
    }
}

abstract class child3 extends parent{
    //also has all classes and abstract classes of parent
    abstract void ask();
    abstract void tell();
    // base for grand children
}


public class abstractClasses {
    public static void main(String[] args) {
        child2 c = new child2();
        c.hello();
        c.greet();
        c.byee();

        parent c1 = new child1();
        c1.greet();
        c1.hello();
        //c1.nextLine(); ---> error because of dynamic dispatch

        child3 c2 = new child3() {
            @Override
            void ask() {
                System.out.println("What is your name?");
            }

            @Override
            void tell() {
                System.out.println("My name is Sid");
            }

            @Override
            void greet() {
                System.out.println("Good afternoon");
            }
        };
        c2.hello();
        c2.greet();
        c2.ask();
        c2.tell();



    }
}
