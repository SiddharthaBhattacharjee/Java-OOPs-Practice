package com.company;

class c1{
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    public void meth1(){
        System.out.println(a+","+b+","+c+","+d);
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        //System.out.println(c.d);

    }
}

