class Solution {
    public int[] twoSum(int[] arr, int target) {
        //    for(int i=0; i<nums.length-1;i++){
        //        for(int j=i+1; j<nums.length;j++){
        //             if(nums[i]+nums[j]==target) return new int[] {i,j};
        //        }
        //    }
        //    return new int[] {};
         HashMap<Integer ,Integer> hm = new HashMap<>();
         for(int i=0;i<arr.length;i++){
                int required = target -arr[i];
            if(hm.containsKey(required)) return new int[]{hm.get(required),i};

            hm.put(arr[i],i);
         }
    return new int[]{};
    }
    
}