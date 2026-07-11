class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>groups=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String a=strs[i];
            char[] chars=a.toCharArray();
            Arrays.sort(chars);
            String signature=new String(chars);
            groups.putIfAbsent(signature,new ArrayList<>());
            groups.get(signature).add(a);
        }
        return new ArrayList<>(groups.values());
    }
}
