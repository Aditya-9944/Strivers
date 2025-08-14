class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int num:nums){
            j^=num;
        }
        return j;

    }
}
