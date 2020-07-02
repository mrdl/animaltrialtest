package models;

import interfaces.SoundMakable;

public class Dog extends Animal implements SoundMakable {
    public void makeSound(){
        System.out.println("Woof, woof");
    }
}
