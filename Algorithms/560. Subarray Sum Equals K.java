class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0; //initialize count to be 0
        //use a for loop to find every possible subarray inside array nums
        for (int start = 0; start < nums.length; start++){
            for (int end = start + 1; end <=nums.length; end++){
                int sum = 0; //initialize the sum to be 0 at the beginning
                for ( int i = start; i < end; i++)//use for loop to add up the numbers inside the subarray
                    sum += nums[i];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}
