class Solution {

    public String encode(List<String> strs) {
StringBuilder encodedstring=new StringBuilder();
for(String str:strs){
encodedstring.append(str.length()).append("#").append(str);
    }
    return encodedstring.toString();
}
    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int sepId=str.indexOf("#",i);
            int len=Integer.parseInt(str.substring(i,sepId));
            i=sepId+1;

            String decoded=str.substring(i,i+len);
            result.add(decoded);

            i=i+len;
        }
        return result;

    }
}
