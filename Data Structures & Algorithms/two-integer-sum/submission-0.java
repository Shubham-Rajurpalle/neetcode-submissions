class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int ans[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(target-nums[i])){
                int min=Math.min(i,hmap.get(target-nums[i]));
                int max=Math.max(i,hmap.get(target-nums[i]));
                ans[0]=min;
                ans[1]=max;
                return ans;
            }
            hmap.put(nums[i],i);
        }
        return ans;
    }
}
