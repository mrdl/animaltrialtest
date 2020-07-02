package models;

import interfaces.Flyable;
import interfaces.SoundMakable;
import interfaces.Swimmable;
import utility.Utility;

public class Duck extends Bird implements Flyable, Swimmable, SoundMakable {
    public void fly(){
        Utility.doAction("flying");
    }

    public void swim(){
        Utility.doAction("swimming");
    }

    public void makeSound(){
        System.out.println("Cluck, cluck");
    }
}
