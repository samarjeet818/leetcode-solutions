class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        loop:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                while(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break loop;
                }
            }
            
        }

    return a;
    }
}