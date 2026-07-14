class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>numSet=new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        int longeststreak=0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int currentNum=num;
                int currentstreak=1;
            
            while(numSet.contains(currentNum+1)){
                currentNum+=1;
                currentstreak+=1;
            }
            longeststreak=Math.max(longeststreak,currentstreak);
        }
        }
        return longeststreak;
    }
}
