import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> availableOptionsMap = new HashMap<>();

        for (int i=0; i< nums.length;i++) {
            int compliment  = target - nums[i];
            if(availableOptionsMap.containsKey(compliment)) {
                return new int[]{availableOptionsMap.get(compliment),i };
            }

            availableOptionsMap.put(nums[i],i);
        }

        return new int[2];
    }
}