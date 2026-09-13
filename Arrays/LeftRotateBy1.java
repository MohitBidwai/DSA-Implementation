public class LeftRotateBy1{
    public static void leftRotateBy1(int [] arr)
    {
      int temp = arr[0];
      for(int i = 1;i<arr.length;i++)
      {
        arr[i-1] = arr[i];
      }

      arr[arr.length-1] = temp;

      for(int i = 0 ; i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
    public static  void main(String [] args)
    {
        int [] arr = {1,2,3,5,6,7};
        leftRotateBy1(arr);

    }

}