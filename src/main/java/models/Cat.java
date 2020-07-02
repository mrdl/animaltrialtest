package models;

import interfaces.SoundMakable;

public class Cat extends Animal implements SoundMakable {
    public void makeSound(){
        System.out.println("Meow");
    }
}
