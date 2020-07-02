package api;

import global.Zoo;
import models.Animal;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AnimalController {
    @RequestMapping(method = RequestMethod.POST, value = "/animal/getFlyableCount")
    public int getFlyingAnimalCount() {
        return Zoo.getInstance().getFlyableCount();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/animal/insert")
    public void insertAnimal(@RequestBody Animal animal) {
        Zoo.getInstance().insert(animal);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/animal/insertMany")
    public void insertAnimals(@RequestBody Animal[] animals) {
        Zoo.getInstance().insert(animals);
    }
}
