import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MaxSubarray {

    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }


    static  public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
        	sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
            System.out.println("########################\n");
        	}
        return result;
    }

     public static List printaVetor(int[] n) {
    	 List<String> answer= new ArrayList<>();
    	 	for (int i = 0; i < n.length; i++) {
    	 		answer.add(""+n[i]);
		}
   	 return answer;
      }
}