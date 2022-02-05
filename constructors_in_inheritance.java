package com.company;

class base1{
    private int x;
    public base1(int x) {
        this.x = x;
    }
    public base1() {
        System.out.println("No arguments found for x");
    }
    public int getX() {
        return x;
    }
}

class derived1 extends base1{
    private int y;
    public int getY() {
        return y;
    }
    public derived1(int y , int x) {
        super(x);
        this.y = y;
    }
    public derived1(int y){
        this.y = y;
    }
    public derived1(){
        System.out.println("No argument found for y");
    }
}

class childOfDerived extends derived1{
    private int z;
    public childOfDerived(int z) {
        this.z = z;
    }
    public childOfDerived(int z, int y){
        super(y);
        this.z = z;
    }
    public childOfDerived(int z, int y, int x) {
        super(y, x);
        this.z = z;
    }
    public childOfDerived() {
        System.out.println("No argument found for z");
    }
    public int getZ() {
        return z;
    }
}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        derived1 a = new derived1(5, 10);
        System.out.println(a.getY());
        System.out.println(a.getX());

        derived1 b = new derived1(4);
        System.out.println(b.getY());
        System.out.println(b.getX());

        derived1 c = new derived1();
        System.out.println(c.getX());
        System.out.println(c.getY());

        childOfDerived a1 = new childOfDerived(10,20,30);
        System.out.println(a1.getX()+" , "+a1.getY()+" , "+a1.getZ());

        childOfDerived b1 = new childOfDerived(11,22);
        System.out.println(b1.getX()+" , "+b1.getY()+" , "+b1.getZ());

        childOfDerived c1 = new childOfDerived(12);
        System.out.println(c1.getX()+" , "+c1.getY()+" , "+c1.getZ());

        childOfDerived d1 = new childOfDerived();
        System.out.println(d1.getX()+" , "+d1.getY()+" , "+d1.getZ());
    }
}
