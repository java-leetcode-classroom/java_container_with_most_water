public class Solution {
  public int maxArea(int[] height) {
    int mArea = 0;
    int lp = 0, rp = height.length -1;
    while (lp < rp) {
      mArea = Math.max(mArea, Math.min(height[lp], height[rp]) * (rp - lp));
      if (height[lp] > height[rp]) {
        rp--;
      } else {
        lp++;
      }
    }
    return mArea;
  }
}
