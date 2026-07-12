class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<Integer>[]buckets=new List[nums.length+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer>entry:count.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            buckets[freq].add(num);
        }
        List<Integer>result=new ArrayList<>();
        for(int i=buckets.length-1;i>=0 && result.size()<k;i--){
            for(int num:buckets[i]){
                result.add(num);
                if(result.size()==k)break;
            }
        }

        //convert List<Integer> to int[]
        int[]output=new int[result.size()];
        for(int i=0;i<result.size();i++){
            output[i]=result.get(i);
        }
        return output;

    }

}
