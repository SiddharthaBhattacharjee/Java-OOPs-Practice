package com.company;
import java.util.Arrays;

interface bicycle{
    int initialspeed = 15;
    void applyBreak(int retardation);
    void speedUP(int acceleration);
    int getSpeed();
}

interface brand{
    void updateName(String name);
    void updateValue(int value);
}

class Avon implements bicycle,brand{
    private int speed = initialspeed;
    String name = "Avon V1";
    int value = 6000;
    @Override
    public void applyBreak(int decrement){
        speed -= decrement;
    }
    @Override
    public void speedUP(int acceleration){
        speed += acceleration;
    }
    @Override
    public void updateName(String name){
        this.name = name;
    }
    @Override
    public void updateValue(int value){
        this.value = value;
    }
    @Override
    public int getSpeed(){
        return speed;
    }
    public String[] getBranding(){
        String[] branding = {name, String.valueOf(value)};
        return branding;
    }
}

class unbrandedCycle implements bicycle{
    private int speed = initialspeed;
    @Override
    public void applyBreak(int decrement){
        speed = speed - 2*decrement;
    }
    @Override
    public void speedUP(int acceleration){
        speed = speed + 2*acceleration;
    }
    @Override
    public int getSpeed(){
        return speed;
    }
    public int price(){
        return 2000;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Avon c = new Avon();
        c.updateValue(7000);
        c.applyBreak(10);
        c.speedUP(4);
        System.out.println("Brand : "+ Arrays.toString(c.getBranding()) +"\n Speed : "+c.getSpeed());

        unbrandedCycle c1 = new unbrandedCycle();
        c1.applyBreak(5);
        c1.speedUP(4);
        System.out.println("Speed : "+c1.getSpeed()+" Price : "+c1.price());

        bicycle b = new unbrandedCycle();
        b.applyBreak(10);
        b.speedUP(15);
        System.out.println("Speed : "+b.getSpeed());
        //System.out.println("Price : "+b.price()); ---> Error because price is method of unbrandedCycle (Dynamic Dispatch)
    }
}
