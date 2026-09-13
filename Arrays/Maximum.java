public class Maximum {

    public static int maxElement(int [] arr)
    {
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>maxValue)
            {
                maxValue = arr[i];
            }

        }

        return  maxValue;

    }

    public static int secondMaxEle(int arr[])
    {
        int maxValue = maxElement(arr);
        int secondMax = Integer.MIN_VALUE;

         for(int i =0;i<arr.length;i++)
         {
             if(arr[i]>secondMax && arr[i]<maxValue)
             {
                secondMax = arr[i];
             }
         }

         return secondMax;
        

    }
    //One pass appproach

//     public static int secondMaxEle(int arr[]) {

//     int maxValue = Integer.MIN_VALUE;
//     int secondMax = Integer.MIN_VALUE;

//     for (int i = 0; i < arr.length; i++) {

//         if (arr[i] > maxValue) {
//             secondMax = maxValue;
//             maxValue = arr[i];
//         }
//         else if (arr[i] > secondMax && arr[i] < maxValue) {
//             secondMax = arr[i];
//         }
//     }

//     return secondMax;
// }
    public static void main(String[] args) {
        int arr [] = {100 ,200 ,300, 500, 1000 ,7000};
        int max = maxElement(arr);
        int secondMax = secondMaxEle(arr);
        System.out.println("Max element is:" + max);
        System.out.println("Second Max element is:" + secondMax);
    }
}
