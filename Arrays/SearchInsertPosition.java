public class SearchInsertPosition {


  public static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                index= i;
            }
            else if(nums[i]>target&&nums[i]<target)
            {
                    index= i;
            }
            else if(nums[i]<target)
            {
                    index =i+1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int targret =5;
      //   int[] nums = {1,3,5,6}; target 2
      //    int[] nums = {1,3,5,6}; target 7;
      System.out.println(searchInsert(nums, targret));
    }
}
