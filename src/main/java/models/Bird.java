package models;

import interfaces.Flyable;
import interfaces.Singable;
import utility.Utility;

public class Bird extends Animal implements Flyable, Singable {
    public void fly() {
        Utility.doAction("flying");
    }

    public void sing(){
        Utility.doAction("singing");
    }
}