class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int n = nums.length-1;

        while(i<=n){
            int mid=(i+n)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                i=mid+1;
            }else{
                n=mid-1;
            }
        }

        return -1;
    }
}
