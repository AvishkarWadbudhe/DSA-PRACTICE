class TwoSum{

static int[] twoSum(int[] nums,int target)
{
  int[] index = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }
        return null;
    }

public static void main(String[] args) {

    int[] nums ={2,5,5,11};
    int target = 13;

    int[] result = twoSum(nums,target);
    int first = result[0];
    int second = result[1];
    System.out.println(first+","+second);
}
}