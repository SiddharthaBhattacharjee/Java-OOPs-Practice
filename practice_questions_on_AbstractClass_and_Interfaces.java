package com.company;

/* Questions :
1.Create an abstract class pen with methods write() and refill() as methods.
2.Use the pen class from (1) to create a concrete class fountain pen with additional method changeNib()
3.Create a class monkey with jump() and bite() methods , create a class human which inherits this monkey class and implements
  BasicAnimal interface with eat() and sleep() methods.
4.Create a class Telephone with ring() , lift() and disconnect() methods as abstract methods, Create another class SmartTelephone and demonstrate
  Polymorphism. NA
5.Demonstrate polymorphism using monkey class from (3)
6.Create an Interface TV remote and use it to inherit another interface smartTV remote.
7.Create a class TV that implements TV Remote interface of (6)
 */

import org.w3c.dom.ls.LSOutput;

// Q1 and Q2
abstract class pen{
    abstract void write(int len);
    void refill(){
        System.out.println("Refilled pen!");
    }
}

class fountainPen extends pen{
    @Override
    void write(int len){
        System.out.println("Writing till "+len+" Meters");
    }
    void changeNib(){
        System.out.println("New nib installed");
    }
}

//Q3
class monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

interface basicAnimal{
    void eat();
    void drink();
    void sleep();
}

class human extends monkey implements basicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating omnivorous food");
    }
    @Override
    public void drink(){
        System.out.println("Drinking water");
    }
    @Override
    public void sleep(){
        System.out.println("Zzzzzzzzzzzzzzzzzzzzz...");
    }
}

//Q6
interface tvRemote{
    void changeChannel(int cn);
    void sound(int inc);
    void power();
    void changeMedia();
}

abstract class smartTVRemote implements tvRemote{
    abstract void wifi();
    abstract void youtube();
    abstract void Stream();
}
//Q7
class TV implements tvRemote{
    int channel = 001;
    int volume = 20;
    boolean power = false;
    int media = 1;
    void watch(){
        if(power){
        System.out.println("Playing channel "+channel+" , volume : "+volume);
        }
    }
    @Override
    public void changeChannel(int cn){
        if(power){
        this.channel = cn;
        }
    }
    @Override
    public void sound(int boost){
        if(power){
        this.volume += boost;
        }
    }
    @Override
    public void power(){
        this.power = !power;
    }
    @Override
    public void changeMedia(){
        if(power){
            if(media == 1){
                media = 2;
            }
            else if(media == 2){
                media = 1;
            }
        }
    }
}

public class practice_questions_on_AbstractClass_and_Interfaces {
    public static void main(String[] args) {
        //Q5
        monkey bandra = new human();
        bandra.bite();

    }
}
