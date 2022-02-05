package com.company;

import java.util.Arrays;

/*
Questions :
1. create a class Cylinder and use getter and setters to set its radius and height.
2.use (1) to calculate surface area and volume of the cylinder
3.repeat (1) for a spare but with constructor
4.overload a constructor used to initialise (3)
 */
class cylinder{
    private int h;
    private int r;
    public void set(int height, int radius){//setter
        h = height;
        r = radius;
    }
    public int[] get(){ return new int[]{h, r}; }//getter
    //methods
    public int getVolume(){ return (int) (Math.PI*r*r*h); }
    public int getCSA(){ return (int) (2*Math.PI*r*h); }
    public int getTSA(){ return (int) ((2*Math.PI*r*r)+(2*Math.PI*r*h));}
}

class sphere{
    private int r;
    public sphere(int radius){
        r = radius;
    }
    public sphere(){//default
        r = 1;
    }
    public int getRadius(){ return r; }
    public int getSA(){ return (int) (4*Math.PI*r*r);}
    public int getVolume(){ return (int) ((4*Math.PI*r*r*r)/3);}
}

public class practice_question_4_AccessModifierAndConstructor {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.set(5,2);
        System.out.println("[Height , Radius] of cylinder : "+ Arrays.toString(c.get()));
        System.out.println("CSA of cylinder : "+c.getCSA());
        System.out.println("TSA of cylinder : "+c.getTSA());
        System.out.println("Volume of cylinder : "+c.getVolume());

        sphere s = new sphere(5);
        System.out.println("Radius of sphere is : "+s.getRadius());
        System.out.println("SA of sphere is : "+s.getSA());
        System.out.println("Volume of sphere is : "+s.getVolume());

    }
}
