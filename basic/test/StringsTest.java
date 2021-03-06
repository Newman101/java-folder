import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringsTest {

  @Test
  public void removeCharacterTest() {

    // Initialize the class under test
    Strings tester = new Strings();

    // Assertions
    assertEquals("Hllo", tester.removeCharacter("Hello", 1));
    assertEquals("Worl", tester.removeCharacter("World", 4));
  }

  @Test
  public void reverseStringTest() {

      Strings tester = new Strings();
      assertEquals("dlroW olleH", tester.reverseString("Hello World"));
  }

  @Test
  public void howManyTest() {
    Strings tester = new Strings();
    assertEquals(2, tester.howMany("Hello, World", 'o'));
  }

  @Test
  public void compareLenTest() {
    Strings tester = new Strings();
    assertEquals("Foobar", tester.compareLen("Foobar", "Foo"));
  }
}
