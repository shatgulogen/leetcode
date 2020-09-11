class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0, j = 0;
        while(j < nums.length){
            while(j < nums.length && nums[j] == 0) j++;
            if(j < nums.length){
                nums[i++] = nums[j++]; 
            }
        }
        while(i < nums.length) nums[i++] = 0;
        return;
}
}


        //hint: In-place means we should not be allocating any space for extra array. 
        //But we are allowed to modify the existing array. 
        //However, as a first step, try coming up with a solution that makes use of additional space. 
        //For this problem as well, first apply the idea discussed using an additional array and the in-place solution will pop up eventually.
        //A two-pointer approach could be helpful here. 
        //The idea would be to have one pointer for iterating the array and another pointer that just works on the non-zero elements of the array.
