
class Solution {
    static int removeDuplicates(int[] nums) {
        int n = nums.length,l=0,r=0;
        while(r<n){
            nums[l] = nums[r];
            while(r<n && nums[r] == nums[l]){
                r++;
            }
            l++;
        }
        return l;
        
        
    }
    public static void main(String [] args){
        int[] nums = {2,10,10,30,30,30};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements in array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");

        }

    }
}