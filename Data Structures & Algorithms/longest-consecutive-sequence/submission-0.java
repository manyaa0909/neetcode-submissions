class Solution {
    static boolean linearSearch(int[] nums,int target){
        for(int num:nums){
            if(num==target) return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int longest=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int count=1;
            while(linearSearch(nums,x+1)){
                x=x+1;
                count++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
    
}
