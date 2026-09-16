class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            if(n > max ) max = n;
        }
        boolean freq[] = new boolean[max+1];
        int start = 0;
        long  sum = 0;
        long  maxWeight = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
        while(freq[nums[i]]==true){
            freq[nums[start]]=false;
            sum-=nums[start];
            start++;
        }
        freq[nums[i]]=true;
        sum+=nums[i];
        if((i - start) + 1 == k){
            maxWeight = Math.max(maxWeight, sum);
            freq[nums[start]]=false;
            sum-=nums[start];
            start++;
        }
        }
        if(maxWeight == Integer.MIN_VALUE ) return 0;
        return maxWeight;
    }
}