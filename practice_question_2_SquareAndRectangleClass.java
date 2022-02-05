package com.company;

import java.util.Arrays;

class sq{
    int side;
    public int perimeter(){
        return 4*side;
    }
    public int area(){
        return side*side;
    }
    public int getSide(){
        return side;
    }
}

class rect{
    int length;
    int width;

    public int[] getSides(){
        return new int[]{length, width};
    }

    public int perimeter(){
        return 2*(length+width);
    }

    public int area(){
        return length*width;
    }
}

class cir{
    int radius;

    public int getRadius(){
        return radius;
    }
    public int perimeter(){
        return (int) (2* Math.PI*radius);
    }
    public int area(){
        return (int) (Math.PI*radius*radius);
    }
}

public class practice_question_2_SquareAndRectangleClass {
    public static void main(String[] args) {
        sq s1 = new sq();
        rect r1 = new rect();
        cir c1 = new cir();

        s1.side = 5;
        r1.length = 10;
        r1.width = 4;
        c1.radius = 4;

        System.out.println("Square s1 has side : "+s1.getSide()+" , perimeter : "+s1.perimeter()+" & area : "+s1.area());
        System.out.println("Rectangle r1 has sides : "+ Arrays.toString(r1.getSides()) +" , perimeter : "+r1.perimeter()+" & area : "+r1.area());
        System.out.println("Circle c1 has radius : "+c1.getRadius()+" , perimeter : "+c1.perimeter()+" & area : "+c1.area());
    }
}
