class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet h = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            if(h.contains(nums[i])){
                return true;
            }
            h.add(nums[i]);
        }
        return false;
    }
}