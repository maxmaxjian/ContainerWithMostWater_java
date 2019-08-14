import java.util.Arrays;
import java.util.List;

public class SolutionRunner {

    public static void main(String[] args) {
//        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height = {1,1};

        Solution soln = new Solution1();
        int maxWater = soln.maxArea(height);
        System.out.println("The most water that can be contained is: " + maxWater);
    }
}
