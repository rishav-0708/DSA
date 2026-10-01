class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int resultsum= nums[0]+nums[1]+nums[2] ;

       for(int i=0; i<nums.length ; i++){
            int j=i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum-target);
                if(diff<Math.abs(resultsum-target)){
                    resultsum=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
       }
       return resultsum;   
    }
}