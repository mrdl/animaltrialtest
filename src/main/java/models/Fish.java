package models;

import interfaces.Swimmable;
import utility.Utility;

public class Fish extends Animal implements Swimmable {
    public void swim(){
        Utility.doAction("swimming");
    }
}
