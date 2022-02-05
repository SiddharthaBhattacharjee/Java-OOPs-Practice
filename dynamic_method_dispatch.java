package com.company;
//Smartphone is a phone but phone is not a smartphone
class phone{
    public void onn(){
        System.out.println("Turning on phone...");
    }
    public void call(){
        System.out.println("Calling...");
    }
    public void showTime(){
        System.out.println("Time is XX:XX");
    }
}

class smartphone extends phone{
    @Override
    public void onn(){
        System.out.println("Turning on Smartphone...");
    }
    public void playMusic(){
        System.out.println("Playing music...");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone s = new smartphone();
        s.onn(); // will return turning onn smartphone
        s.call();
        s.showTime();
        //s.playMusic(); //this is not allowed as it is referred to as phone
    }
}
