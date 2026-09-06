class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>window=new HashMap<>();
        Map<Character,Integer>map_s1=new HashMap<>();
        if(t.length()==0){
           return "";
        }
        for(int i=0;i<t.length();i++){
            int count1=map_s1.getOrDefault(t.charAt(i),0)+1;
            map_s1.put(t.charAt(i),count1);
        }
        int need=map_s1.size();
        int left=0;
        int have=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){
            int count=window.getOrDefault(s.charAt(right),0)+1;
            window.put(s.charAt(right),count);//o-1,u-1,z-1
            if(map_s1.containsKey(s.charAt(right))){//o-1 in t? no;z-1 in t?y
                if (window.get(s.charAt(right)).equals(map_s1.get(s.charAt(right)))) {
                    have+=1;
                }
            }
             while(need==have){
                if((right-left+1)<minlen){
                    minlen=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                window.put(leftchar,window.get(leftchar)-1);

                if(map_s1.containsKey(leftchar) && window.get(leftchar)<map_s1.get(leftchar)){
                   have--;
                }
                left++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}