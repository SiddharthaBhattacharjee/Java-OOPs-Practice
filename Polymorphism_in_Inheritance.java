package com.company;

class phone2{
    void onn(){
        System.out.println("Turning onn...");
    }
    void off(){
        System.out.println("Turning off...");
    }
    void connectCall(double n){
        System.out.println("Calling "+n);
    }
    void connectCall(){
        System.out.println("Picking up call...");
    }
    void disconnectCall(){
        System.out.println("Call Disconnected...");
    }
}

interface camera2{
    default void takeSnap(){
        System.out.println("Photo Clicked");
    }
    default void recordVideo(){
        System.out.println("Recording Video");
    }
    void recordSlomo(int fps);
}

interface gps{
    default void locate(){
        System.out.println("Locating you on GPS");
    }
    default void track(String TrackingID){
        System.out.println("Tracking device "+TrackingID);
    }
}

interface mediaPlayer{
    default void playMP3(String file){
        System.out.println("Playing "+file+".mp3");
    }
    default void playMP4(String file){
        System.out.println("Playing "+file+".mp4");
    }
}

class smartPhone2 extends phone2 implements camera2,gps,mediaPlayer{
    @Override
    public void recordSlomo(int fps){
        System.out.println("Recording Slomo in "+fps+" FPS");
    }
    public void sendSMS(double number, String message){
        System.out.println("Sending msg : "+message+" to "+number);
    }
}

public class Polymorphism_in_Inheritance {
    public static void main(String[] args) {

        // if u want to give ur Smartphone to someone just to make calls
        phone2 p = new smartPhone2(); // This is a smartphone , but use it as a phone only
        p.onn();
        p.connectCall(231888);
        p.disconnectCall();
        p.off();

        //if u want to give ur Smartphone to someone just to play Media
        mediaPlayer m = new smartPhone2(); // this is a smartphone but use it as a media player only
        m.playMP3("Jane Meri Janeman");

        //if u want to give ur Smartphone just to use camera
        camera2 c = new smartPhone2(); // this is a smartphone but use it as a camera only
        c.takeSnap();
        c.recordSlomo(25);

        // you want to use your Smartphone without restrictions
        smartPhone2 s = new smartPhone2(); // Here use your smartphone.
        s.onn();
        s.disconnectCall();
        s.sendSMS(231888,"Hello There");
        s.playMP3("Tararara");
        s.takeSnap();
        s.off();
    }
}
