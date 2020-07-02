import global.Zoo;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream standardOut = new ByteArrayOutputStream();
    @BeforeEach
    void init(){
        System.setOut(new PrintStream(standardOut));
    }

    @Test
    void singTest(){
        new Bird().sing();
        assertThat(standardOut.toString(), startsWith("I am singing"));
        standardOut.reset();

        new Rooster().makeSound();
        assertThat(standardOut.toString(), startsWith("Cock-a-doodle-doo"));
        standardOut.reset();

        new Parrot(new Phone()).makeSound();
        assertThat(standardOut.toString(), startsWith("ring ring"));
        standardOut.reset();


    }

    @Test
    void zooTest(){
        Zoo zoo = Zoo.getInstance();
        zoo.insert(new Duck());
        zoo.insert(new Parrot(new Duck()));
        assertEquals(zoo.getFlyableCount(), 2);
        zoo.insert(new Shark());
        zoo.insert(new Animal[]{new Chicken(), new Rooster(), new Parrot()});
        assertEquals(zoo.getFlyableCount(), 3);
    }
}
