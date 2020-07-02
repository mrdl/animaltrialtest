package models;

import global.Translator;

public class Rooster extends Chicken{
    
    public void makeSound(){
        System.out.println(Translator.translate("rooster_sound"));
    }
}
