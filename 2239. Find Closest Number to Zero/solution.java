class Solution{
    public int findClosestNumber(int[] nums){
        int closest = nums[0];
        for(int num: nums){
            if(Math.abs(num) < Math.abs(closest)){
                closest = num;
            }
        }
        if(closest < 0 && contains(nums, closest)){
            return Math.abs(closest);
        }else{
            return closest; 
        }
    }
    
    private boolean contains(int[] nums, int target){
       for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}