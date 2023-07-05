public class BinarySearch {
//     public static boolean binarySearch(int[] arr,int target)
//     {
//         int left = 0;
//         int right = arr.length-1;
//         while(left<=right)
//         {
//             int mid = (left+right)/2;
//             if(arr[mid]==target){
//                 return true;
//             }
//             else if(arr[mid]<target)
//             {
//                 left = mid+1;
//             }
//             else{
//                 right =mid-1;
//             }
//         }
// return false;
//     }

static int binarySearch(int[]arr,int target)
{
    int left  =0;
int right = arr.length-1;
while(left<=right)
{
    int mid = (left+right)/2;
    if(arr[mid]==target)
    {return mid;}
    else if(arr[mid]<target)
    {
            left = mid+1;

    }
    else{
        right = mid -1;
    }
}


    return -1;
}
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 12;
        System.out.println(binarySearch(arr, target));
    }
}
