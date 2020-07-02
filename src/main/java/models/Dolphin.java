package models;

import interfaces.Swimmable;
import utility.Utility;

public class Dolphin implements Swimmable {
    public void swim(){
        Utility.doAction("swimming");
    }
}
