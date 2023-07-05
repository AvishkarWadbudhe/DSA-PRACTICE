class Solution {
   static public int isPalindrome(int[] x) {
       
       for (int i = 0; i <5; i++) {
        
       
        int revNumber = 0;
        int temp = x[i];

        while (temp > 0) {
            int digit = temp % 10;
            revNumber = revNumber * 10 + digit;
            temp = temp / 10;
        }

        if (x[i] != revNumber) {
             return 0;
        }
      
    }
          return 1;
    }
    public static void main(String[] args) {
        int a[] = {111,222,333,444,555};
       System.out.println( isPalindrome(a));
    }
}