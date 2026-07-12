class Solution {
    public String encode(List<String> strs) {
        //5#hello3#cat
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
            int sepId=str.indexOf("#",i);//# at 1
            int len=Integer.parseInt(str.substring(i,sepId));//(0,1)with give 5 the value at index 0 convert to int 
            i=sepId+1;//1+1
            String decoded=str.substring(i,i+len);//(2,7)-hello
            result.add(decoded);
            i=i+len;
        }
        return result;
    }
}
