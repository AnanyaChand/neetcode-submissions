class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            int leftchar=Character.toLowerCase(s.charAt(left));
            int rightchar=Character.toLowerCase(s.charAt(right));
        
        if(!Character.isLetterOrDigit(leftchar)){
            left++;
            continue;
        }
        if(!Character.isLetterOrDigit(rightchar)){
            right--;
            continue;
        }
        if(leftchar!=rightchar){
            return false;
        }
        else{
            left++;
            right--;
        }
        }
        return true;
    }
}
