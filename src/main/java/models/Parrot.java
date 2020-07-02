package models;

import interfaces.Flyable;
import interfaces.SoundMakable;
import utility.Utility;

public class Parrot extends Bird implements SoundMakable, Flyable {
    SoundMakable influencer;

    public Parrot(){
    }

    public Parrot(SoundMakable influencer) {
        this.influencer = influencer;
    }

    public void fly(){
        Utility.doAction("flying");
    }

    public void makeSound(){
        if (influencer == null){
            System.out.println("I am a parrot"); //:D
        }
        else influencer.makeSound();
    }

    public SoundMakable getInfluencer() {
        return influencer;
    }

    public void setInfluencer(SoundMakable influencer) {
        this.influencer = influencer;
    }
}
