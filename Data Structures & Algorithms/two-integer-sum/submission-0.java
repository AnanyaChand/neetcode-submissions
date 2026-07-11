class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>a=new HashMap<>();// keys are numbers, values are their indices
    for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(a.containsKey(diff)){//first iteration a is empty 
            return new int[]{a.get(diff),i};
        }
        a.put(nums[i],i);//first iter-put 3,0
    }
    return new int[]{};
}
}