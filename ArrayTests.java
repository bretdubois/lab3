import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 3, 4, 8, 10 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 10, 8, 4, 3 }, input1);
  }

  @Test
  public void testReversed3() {
    int[] input1 = { 5, 4, 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, input1);
  }
}
