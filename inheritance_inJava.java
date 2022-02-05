package com.company;

class base{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("X set successfully");
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class inheritance_inJava {
    public static void main(String[] args) {
        base a = new base();
        a.setX(5);
        System.out.println(a.getX());

        derived b = new derived();
        b.setX(5);
        b.setY(10);
        System.out.println(b.getX());
        System.out.println(b.getY());
    }
}
