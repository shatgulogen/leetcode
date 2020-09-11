class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length -1;
        // 2 pointers one at the beginning index, the other point to the last index number
        //We use two indexes, initially pointing to the first and last element respectively. 
        // Compare the sum of these two elements with target. If the sum is equal to target, we found the exactly only solution. 
        //If it is less than target, we increase the smaller index by one. If it is greater than target, we decrease the larger index by one. 
        //Move the indexes and repeat the comparison until the solution is found.
        while(lo < hi) {// the lo pointer should not pass the hi pointer
            int currentSum = numbers[lo] + numbers[hi];
            if (currentSum == target) {
                return new int[] { lo+1, hi+1}; 
                // the index in the output starts with 1 instead of 0, so we need to add 1 to the pointers in the new reserved array
            } else if (currentSum > target) {
                hi--; // if the current sum is greater than the target, we move the hi pointer to the left because the array is sorted with right side 
                //numbers always greater than the left side numbers, and so the number which the hi pointer is pointing at will decrease and so the target will decrease as well. 
                //We name the pointer lo and hi instead of left and right because it also shows the value
            } else {
                lo++; // when the currentsum is smaller than target, we move the lo pointer to the right so the number will increase and target will increase too
            }
    }
        return new int[]{2}; //or return new int[]{-1, -1}
}
}



//Time complexity : O(n). Each of the n elements is visited at most once, thus the time complexity is O(n).

//Space complexity : O(1)O(1). We only use two indexes, the space complexity is O(1).

//Do we need to consider if numbers[low] + numbers[high]numbers[low]+numbers[high] overflows? The answer is no.
//Even if adding two elements in the array may overflow, because there is exactly one solution, we will reach the solution first.
