class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      
        int max=Arrays.stream(piles).max().getAsInt();
        int left=1;
        int right=max;
        int result=-1;
        int k;
        while(left<=right){
             int sum=0;
             k=(left+right)/2;
            for(int j=0;j<piles.length;j++){
                int pile=piles[j];
                int divide=(int)Math.ceil((double)pile/k);
                sum=sum+divide;
              
            }
            if(sum>h){
                left=k+1;
               
            }else {
                result=k;
                right=k-1;
                
            }
            
        }
        return result;
    }
}
