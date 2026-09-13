public class RemoveDuplicates {
   
    public static int removeDeuplicates(int [] arr)
    {
       int i = 1;
       for(int j = 1;j<arr.length;j++)
       {
        if(arr[i-1]!=arr[j])
        {
            arr[i]=arr[j];
            i++;
        }
       }
     return i;
    }
    public static void main(String[] args) {
        //sorted array given
            int arr [] = {10,10,20,20,30,40,50,50};
         int size =    removeDeuplicates(arr);
         System.out.println(size);

    }
}
