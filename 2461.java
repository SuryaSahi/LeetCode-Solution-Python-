class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    long maxsum = 0;
    long currsum = 0;
    if(k > nums.length)
    {
        return 0;
    }
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0, j = 0; i<nums.length; i++)
    {
        int curr = nums[i];
        while(set.size() == k || set.contains(curr))
        {
            currsum -=nums[j];
            set.remove(nums[j]);
            j++;
        }
        set.add(curr);
        currsum +=curr;
        if( set.size() == k && maxsum < currsum)
        {
            maxsum = currsum;
        }
    }
     return maxsum;
    }
}
