public class FindMin {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,-6,7,8};
        System.out.println(minValue(nums));
    }
    public static int minValue(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(ans>nums[i]){
                ans=nums[i];
            }
        }
        return ans;
    }

}
