package models;

import interfaces.Walkable;
import utility.Utility;

public class Animal implements Walkable {
    public void walk(){
        Utility.doAction("walking");
    }
}
