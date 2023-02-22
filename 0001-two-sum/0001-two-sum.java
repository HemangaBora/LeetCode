class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int total = target-nums[i];

                if (nums[j] == total){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}