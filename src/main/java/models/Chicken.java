package models;

import interfaces.SoundMakable;

public class Chicken extends Bird implements SoundMakable {
    public void makeSound(){
        System.out.println("Quack, quack");
    }
}
