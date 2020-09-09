class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length ==1) return nums[0];//take care of the base case where when there is only one number in the original array
        
        int max = Integer.MIN_VALUE;
        int tmpSum = 0;
        for( int i=0; i<nums.length; i++ ){
            tmpSum += nums[i];
            
            if( nums[i]>tmpSum ){ // if all previous sum is less than the current element, reset the tmpSum
                tmpSum = nums[i];
            }
            max = Math.max(max, tmpSum);
        }
        return max;
    }
}
