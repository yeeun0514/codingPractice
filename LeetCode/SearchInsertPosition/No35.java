package SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        for(int i=0; i<size; i++){
            if(nums[i] == target || nums[i] > target){
                return i;
            }
        }
        return size;
    }
}