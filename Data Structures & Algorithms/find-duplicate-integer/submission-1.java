class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int op=0;
        for(int i=0;i<nums.length;i++){
            int count=map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],count);
            if(count>1){
                op=op+nums[i];
                break;
            }
        }
    return op;
    }
}
