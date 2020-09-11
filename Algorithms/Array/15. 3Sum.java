class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);// we need to start with a sorted array, so the first thing is to sort
        List<List<Integer>> res = new ArrayList<>();
        Set<Pair<Integer, Integer>> set = new HashSet<>();//this is for the restriction that solution set must not contain duplicate triplets
        for(int i = 0; i < nums.length - 2; i++){//fix the i and play around with j and k, the reason for nums.length-2 is that i can only go to 
            //nums.length - 3 because it needs to be triplets with 3 numbers in the list inside the array
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] > 0) k--;
                else if(nums[i] + nums[j] + nums[k] < 0) j++;
                else{
                    if(!set.contains(new Pair(nums[i], nums[j]))){//in the case where the pair formed by numsi and numsj does not contain in the set
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));//we will add this pair into the array list
                        set.add(new Pair(nums[i], nums[j]));
                    }
                    j++;
                    k--;
                }
            }
        }
        
        return res;
    }
}
