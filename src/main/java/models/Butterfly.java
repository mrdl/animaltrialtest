package models;

import interfaces.Flyable;
import utility.Utility;

public class Butterfly extends Animal implements Flyable {
    public void fly(){
        Utility.doAction("flying");
    }
}
