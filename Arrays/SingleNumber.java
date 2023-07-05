public class SingleNumber {
  
      static  public int singleNumber(int[] nums) {
            int output =0;
          for(int i=0;i<nums.length;i++){
          
          output ^=nums[i];
    
          }
           return output;
          
    }
    public static void main(String[] args) {
        int[] nums ={2,2,1}; //[4,1,2,1,2]  //[1]
        System.out.println(singleNumber(nums));
    }
}
