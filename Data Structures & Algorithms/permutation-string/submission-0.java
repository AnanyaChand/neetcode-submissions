class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int right=s1.length()-1;
        Map<Character,Integer>map_s1=new HashMap<>();
        Map<Character,Integer>map_s2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            int count=map_s1.getOrDefault(s1.charAt(i),0)+1;
            map_s1.put(s1.charAt(i),count);
        }
        while(right<s2.length()){
            map_s2.clear();
        for(int j=left;j<=right;j++){
            int count_s2=map_s2.getOrDefault(s2.charAt(j),0)+1;
            map_s2.put(s2.charAt(j),count_s2);
        }
            if(map_s1.equals(map_s2)){
                return true;
            }
            else{
                left++;
                right++;
                
            }
        
        }
        return false;
    }
}
