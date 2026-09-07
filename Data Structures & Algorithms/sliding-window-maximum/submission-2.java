class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>deque=new ArrayDeque<>();
       int []output=new int[nums.length-k+1];
       int index=0;
       for(int i=0;i<nums.length;i++){
        //remove smaller values from back
        while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
            deque.removeLast();
        }
        deque.addLast(i);
        
        //remove index that is outside the window       
        if(deque.peekFirst()<i-k+1){
            deque.removeFirst();
        }
        //if window is complete, store maximun
        if(i>=k-1){
            output[index]=nums[deque.peekFirst()];
            index++;
        }
        }     
        return output;
    }
}
