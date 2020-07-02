package models;

import global.Color;
import global.Size;
import interfaces.FishEatable;
import utility.Utility;

public class Shark extends Fish implements FishEatable {
    public Shark(){
        this.color = Color.GREY;
        this.size = Size.LARGE;
    }

    public void eatFish(){
        Utility.doAction("eating fishes");
    }
}
