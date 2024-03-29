import java.util.List;

public class Solution1 implements Solution {
    @Override
    public int maxArea(int[] height) {

        int result = 0;
        int left = 0, right = height.length-1;
        while (left < right) {
            result = Math.max(result, (right-left)*Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
