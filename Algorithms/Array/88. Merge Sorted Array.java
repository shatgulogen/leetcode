class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int p = nums1.length -1;
        while (p >= 0 ){
            if (m < 0 ) {
                nums1[p] = nums2[n--];
            } else if (n < 0) {
                nums1[p] = nums1[m--];
            } else {
                if (nums1[m] < nums2[n]){
                    nums1[p] = nums2[n--];
                } else {
                    nums1[p]= nums1[m--];
                }
            }
            
            p--;
        }
        
    }
}
