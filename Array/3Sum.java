class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       for(int i = 0 ; i<nums.length; i++){
        if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
        int j= i+1;
        int k = nums.length-1;
        while(j < k){
        int sum =  nums[i] + nums[j] + nums[k];

        if(sum < 0){
            j++;
        }
        else if(sum > 0){
            k--;
        }

        else{
            List<Integer>liss= new ArrayList<>();
            liss.add(nums[i]);
            liss.add(nums[j]);
            liss.add(nums[k]);
            ans.add(liss);
            j++;
            k--;
        while( j < k && nums[j] == nums[j-1]){
            j++;
        }
        while( j < k && nums[k] == nums[k+1]){
            k--;
        }
       } 
       }
       }
       return ans;
    }
}
