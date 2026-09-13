public class Sorted {
    public static boolean SortedOrNot(int [] arr)
    {
        Boolean flag = true;
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                continue;
            }

            else {
                flag = false;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,60};
        int arr1 [] = {1,3,4,9,1};
        
        SortedOrNot(arr);
        System.out.println("This array is :" + SortedOrNot(arr1));
        System.out.println("This array is :" + SortedOrNot(arr));

        

    }
}