class Solution {
    public int characterReplacement(String s, int k) {
       Map<Character,Integer>map=new HashMap<>();
        int left=0;
        int max_freq=0;
        int max_length=0;
        for(int right=0;right<s.length();right++){
            int count=map.getOrDefault(s.charAt(right),0)+1;
             map.put(s.charAt(right),count);
             max_freq=Math.max(max_freq,count);
            int repl=(right-left+1)-max_freq;
            if(repl>k){
                char left_char=s.charAt(left);
                map.put(left_char,map.get(left_char)-1);
                left++;
            }
        max_length=Math.max(max_length,right-left+1);    
        }
        return max_length;
    }
}
