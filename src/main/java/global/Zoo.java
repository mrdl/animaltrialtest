package global;

import interfaces.Flyable;
import interfaces.Singable;
import interfaces.Swimmable;
import interfaces.Walkable;
import models.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private static final Zoo SINGLE_INSTANCE = new Zoo();

    public static Zoo getInstance() {
        return SINGLE_INSTANCE;
    }
    List<Animal> animalList;
    int flyableCount;
    int walkableCount;
    int singableCount;
    int swimmableCount;

    public Zoo(){
        animalList = new ArrayList<Animal>();
    }

    public void insert(Animal[] animals){
        for (Animal animal : animals){
            insert(animal);
        }
    }

    public void insert(Animal animal){
        animalList.add(animal);
        if (animal instanceof Flyable) flyableCount++;
        if (animal instanceof Walkable) walkableCount++;
        if (animal instanceof Singable) singableCount++;
        if (animal instanceof Swimmable) swimmableCount++;
    }

    public int size(){
        return animalList.size();
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public int getFlyableCount() {
        return flyableCount;
    }

    public void setFlyableCount(int flyableCount) {
        this.flyableCount = flyableCount;
    }

    public int getWalkableCount() {
        return walkableCount;
    }

    public void setWalkableCount(int walkableCount) {
        this.walkableCount = walkableCount;
    }

    public int getSingableCount() {
        return singableCount;
    }

    public void setSingableCount(int singableCount) {
        this.singableCount = singableCount;
    }

    public int getSwimmableCount() {
        return swimmableCount;
    }

    public void setSwimmableCount(int swimmableCount) {
        this.swimmableCount = swimmableCount;
    }
}
