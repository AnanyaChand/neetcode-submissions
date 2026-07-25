

class Solution {
    public int search(int[] nums, int target) {
        // Use Java's built-in binary search
        int index = Arrays.binarySearch(nums, target);
        
        // If found, index will be 0 or positive.
        // If not found, it returns a negative number.
        if(index>=0){
            return index;
        }
        else{
            return -1;
        }
    }
}
