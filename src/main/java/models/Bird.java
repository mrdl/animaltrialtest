package models;

import interfaces.Singable;
import utility.Utility;

public class Bird extends Animal implements Singable {
    public void sing(){
        Utility.doAction("singing");
    }
}