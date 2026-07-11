class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer>name=new HashSet<>();
      for(int i=0;i<nums.length;i++){
      if(name.contains(nums[i])){
        return true;
      }
      name.add(nums[i]);
      }
       return false;
    }
}