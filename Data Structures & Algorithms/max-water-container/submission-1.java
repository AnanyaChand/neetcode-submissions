class Solution {
    public int maxArea(int[] heights) {
        List<Integer>result=new ArrayList<>();
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int area=(right-left)*Math.min(heights[left],heights[right]);
            result.add(area);
            if(heights[left]<heights[right]){
                left++;
            }
            else if(heights[left]>heights[right]){
                right--;
            }
            else{   //equals to case
                left++;
            }
            
            
            
        }
        return Collections.max(result);
    }
}
