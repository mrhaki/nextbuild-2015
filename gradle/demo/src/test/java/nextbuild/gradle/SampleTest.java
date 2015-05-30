package nextbuild.gradle;

import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void readWelcomeMessage() {
        final Sample sample = new Sample();

        final String message = sample.getWelcomeMessage();

        Assert.assertEquals("Welcome to Gradle", message);
    }
}