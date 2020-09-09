class Solution {
    public int[] sortArray(int[] nums) {
        
        // we want to divide our array into 2 sublists of sorted numbers and unsorted numbers
        // we need to keep track of the index of the first number of the unsorted sublist
        // At the very beginning, all numbers are unsorted, so the start index is equal to 0
        int startindex = 0; 
        //when the start index gets all the way to the final index, that means we only have one number, and we are done
        while (startindex < nums.length -1){
            //we want to find the smallest number in the unsorted sublist, we want to find the index of the smallest number that is located
            int smallestindex = startindex;//initialize the smallest index to be the start current index
            //now we use for loop to iterate through the unsorted sublist, starting at the startindex +1, the second number in the unsorted sublist going
            //all the way to the end of the array
            for (int i = startindex +1; i < nums.length; i++){
                if(nums[smallestindex] > nums[i]){
                    smallestindex = i;
                }
            }
            //we swap the numbers
            swap(startindex, smallestindex, nums);
            startindex++;
        }
        return nums;
    }
            // write a seperate function swap to swap the smallest number in order to put the smallest number in the sorted array
            public static void swap(int i, int j, int[] array){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            
        }
      
        
