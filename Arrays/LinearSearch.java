class LinearSearch{
    public static boolean linearSearch(int[] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                    return true;
            }
        }


return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,3};
        int target = 7;
        System.out.println(linearSearch(arr, target));
    }
}