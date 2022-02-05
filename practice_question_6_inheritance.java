package com.company;
/*
1.Create  class Circle and use inheritance to create another class cylinder from it #done
2.Create class Rectangle and use inheritance to create another class cuboid.#done
3.create method area and volume in (1) #done
4.create method for area and volume in (2) (also create getter and setter)#done
 */

class Circle{
    protected int r;
    public Circle(int radius) {
        this.r = radius;
    }
    public float getArea(){
        return (float) (Math.PI*r*r);
    }
}

class Cylinder extends Circle{
    int h;

    public Cylinder(int radius, int h) {
        super(radius);
        this.h = h;
    }
    public float getCSA(){
        return (float) (2*Math.PI*this.r*h);
    }
    public float getTSA(){
        return this.getCSA()+2*this.getArea();
    }
    public float getVolume(){
        return (float) (Math.PI*r*r*h);
    }
}

class rectangle{
    int l,b;
    public rectangle(int length , int breadth){
        this.l = length;
        this.b = breadth;
    }
    public int getArea(){
        return l*b;
    }
}

class cuboid extends rectangle{
    int h;

    public cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.h = height;
    }

    public int getSA(){
        return 2*(this.getArea()+b*h+h*l);
    }
    public int getVolume(){
        return this.getArea()*h;
    }
}

public class practice_question_6_inheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(2,5);
        System.out.println("Area of circle : "+c.getArea());
        System.out.println("CSA of Cylinder : "+c.getCSA());
        System.out.println("TSA of Cylinder : "+c.getTSA());
        System.out.println("Volume of Cylinder : "+c.getVolume());

        cuboid k = new cuboid(3,4,5);
        System.out.println("Area of base rectangle : "+k.getArea());
        System.out.println("SA of cuboid is : "+k.getSA());
        System.out.println("Volume of cuboid is : "+k.getVolume());
    }
}
