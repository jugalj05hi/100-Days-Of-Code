import java.util.Arrays;

public class BubbleSort {

    int arr[];

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    // [99,24,1,5,86,43]
    public void sort() {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(j, j + 1);
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    private void swap(int position1, int position2) {

        int temp = arr[position2];
        arr[position2] = arr[position1];
        arr[position1] = temp;
    }


}