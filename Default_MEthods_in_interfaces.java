package com.company;

abstract class myPhone{
    public void makeCall(double number){
        System.out.println("Calling "+number);
    }
    public void takeCall(){
        System.out.println("Picking up call");
    }
    public void rejectCall(){
        System.out.println("Rejected call");
    }
    public void disconnectCall(){
        System.out.println("Disconnected call");
    }
    abstract void Onn();
    abstract void Off();
}

interface camera{
    default void takeSnap(){
        System.out.println("Taking a snap");
    }
    void recordVideo();
    void recordSlomo();
    int fps = 30;
}

interface filter{
    default void takeSnap(){
        System.out.println("Taking a snap with Filter");
    }
    void recordVideo();
    void photoFilter();
    void VideoFilter();
    void SlomoFilter();
}

interface camera4K extends camera,filter{
    default void takeSnap4K(){
        System.out.println("Taking 4K photo");
    }
    void recordVideo4K();
    void recordSlomo4K();

    @Override
    default void takeSnap() {
        filter.super.takeSnap(); // Handeling Same named Methods in Multiple inheritance in Interface
    }
}

class cameraPhone extends myPhone implements camera{
    @Override
    public void recordVideo(){
        System.out.println("Recording video");
    }
    @Override
    public  void recordSlomo(){
        System.out.println("recording Slowmotion video in "+fps+" FPS");
    }
    @Override
    public void Onn(){
        System.out.println("Welcome User!");
    }
    @Override
    public void Off(){
        System.out.println("Turning off...");
    }
}

class ultraCameraPhone extends myPhone implements camera4K{
    @Override
    public void recordVideo(){
        System.out.println("Recording video");
    }
    @Override
    public  void recordSlomo(){
        System.out.println("recording Slowmotion video in "+fps+" FPS");
    }
    @Override
    public void Onn(){
        System.out.println("Welcome User!");
    }
    @Override
    public void Off(){
        System.out.println("Turning off...");
    }
    @Override
    public void recordVideo4K(){
        System.out.println("Recording 4K video...");
    }
    @Override
    public void recordSlomo4K(){
        System.out.println("Recording slomo in 4k in "+fps+" FPS");
    }
    @Override
    public void photoFilter(){
        System.out.println("Photo filter applied...");
    }
    @Override
    public void VideoFilter(){
        System.out.println("Video filter applied...");
    }
    @Override
    public void SlomoFilter(){
        System.out.println("Applying Slomo Filter...");
    }
}

public class Default_MEthods_in_interfaces {
    public static void main(String[] args) {
        cameraPhone c = new cameraPhone();

        c.Onn();
        c.makeCall(231888);
        c.disconnectCall();
        c.takeCall();
        c.disconnectCall();
        c.rejectCall();
        c.takeSnap();
        c.recordVideo();
        c.recordSlomo();
        c.Off();

        ultraCameraPhone uc = new ultraCameraPhone();

        uc.Onn();
        uc.takeSnap();
        uc.VideoFilter();
        uc.recordVideo4K();
        uc.makeCall(231888);
        uc.disconnectCall();
        uc.Off();
    }
}
