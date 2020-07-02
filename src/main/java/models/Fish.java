package models;

import global.Color;
import global.Size;
import interfaces.Swimmable;
import utility.Utility;

public class Fish implements Swimmable {
    protected Color color;
    protected Size size;

    public void swim(){
        Utility.doAction("swimming");
    }
}
