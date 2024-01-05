class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int count = 0;
        Set<String> set = new HashSet();
        int len = nums.length;
        for(int i = 0; i < len; ++i){
            int countForK = 0;
            StringBuilder sub = new StringBuilder();
            for(int j = i; j < len; ++j){
                sub.append(nums[j]+ " ");
                if(nums[j] % p == 0) countForK++;
                if(countForK > k) break;
                if(!set.contains(sub.toString())){
                    count++;
                    set.add(sub.toString());
                }
            }

        }
        return count;
    }
}