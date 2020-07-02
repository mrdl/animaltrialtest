package models;

import interfaces.SoundMakable;

public class Parrot extends Bird implements SoundMakable {
    SoundMakable influencer;

    public Parrot(SoundMakable influencer) {
        this.influencer = influencer;
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
