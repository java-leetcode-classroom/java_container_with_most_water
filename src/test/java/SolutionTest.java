import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  final private Solution sol = new Solution();
  @Test
  void maxAreaExample1() {
    assertEquals(49, sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
  }
  @Test
  void maxAreaExample2() {
    assertEquals(1, sol.maxArea(new int[]{1,1}));
  }
}