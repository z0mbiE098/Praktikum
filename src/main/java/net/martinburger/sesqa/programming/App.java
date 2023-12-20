package net.martinburger.sesqa.programming;

import org.w3c.dom.Text;

/**
 * Simple <code>Hello world!</code> application.
 *
 */
public final class App {

  private App() {
    // not called - utility classes should not have a public or default constructor
  }

  public static void main(final String[] args) {
    Game g = new Game();
    g.startGame();
  }
}
