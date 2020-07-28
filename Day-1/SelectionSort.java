import java.util.Arrays;

public class SelectionSort {

    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    // [4,5,3,5,1,9,2]
    public void sort() {

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}