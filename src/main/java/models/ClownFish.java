package models;

import global.Color;
import global.Size;
import interfaces.JokeMakable;
import utility.Utility;

public class ClownFish extends Fish implements JokeMakable {
    public ClownFish(){
        this.size = Size.SMALL;
        this.color = Color.ORANGE;
    }

    public void makeJoke(){
        Utility.doAction("making joke");
    }
}
