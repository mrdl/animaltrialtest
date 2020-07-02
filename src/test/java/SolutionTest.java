import models.Bird;
import models.Parrot;
import models.Phone;
import models.Rooster;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

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
}
