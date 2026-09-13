public class Delete {
    public static int deleteElement(int[] arr, int target) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                break;
            }
        }
        if (i == arr.length) {
            return arr.length;
        }

        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return arr.length - 1;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int target = 60;
      int size =   deleteElement(arr, target);
        for(int i = 0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

    }
}