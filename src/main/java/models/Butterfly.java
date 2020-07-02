package models;

import interfaces.Flyable;
import interfaces.Walkable;
import utility.Utility;

public class Butterfly extends Animal implements Flyable {
    AnimalState animalState;

    public Butterfly(){
        this.animalState = new CaterpillarState();
    }

    public void transform(){
        if (this.animalState != null){
            this.animalState = this.animalState.nextState();
        }
    }

    public void fly(){
        Utility.doAction("flying");
    }

    private class ButterflyState extends AnimalState implements Flyable{
        public void fly() {
            Utility.doAction("flying");
        }
    }

    private class CaterpillarState extends AnimalState implements Walkable {
        public void walk(){
            Utility.doAction("crawling");
        }

        public AnimalState nextState(){
            return new ButterflyState();
        }
    }
}
