public class FindIndex {

  
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        int[] index =new int[N];
        int indexCount = 0;
      
        for(int i=0;i<N;i++)
        {
            if(a[i]==key)
            {
              index[indexCount]= i;
                indexCount++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,5};
        int N=6;
        int key=5;
   
    int[] result =  findIndex(a, N, key);

    System.out.println(result[0]+","+result[1]);
    
}
}
