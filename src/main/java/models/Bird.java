package models;

import interfaces.Singable;
import interfaces.Walkable;
import utility.Utility;

public class Bird extends Animal implements Singable, Walkable {
    public void sing(){
        Utility.doAction("singing");
    }

    public void walk(){
        Utility.doAction("walking");
    }
}