package models;

import interfaces.SoundMakable;

public class Phone extends NonLivingObject implements SoundMakable {
    public void makeSound(){
        System.out.println("ring ring");
    }
}
