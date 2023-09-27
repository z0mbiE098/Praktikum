package net.martinburger.sesqa.programming;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  @Test
  void appShouldOutputHelloWorld() throws Exception {
    String output = tapSystemOutNormalized(() -> {
      App.main(null);
    });
    assertEquals("Hello World!\n", output);
  }

}
