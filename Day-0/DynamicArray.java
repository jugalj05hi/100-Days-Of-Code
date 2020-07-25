import java.util.Arrays;

public class DynamicArray {

    private int[] arr;
    private int counter = 0;
    private int size;

    public DynamicArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    public DynamicArray() {
        arr = new int[2];
        this.size = 2;
    }

    void sizeOfArray() {

        System.out.println(size);
    }

    void insert(int value) {
        if (counter == size) {
            size *= 2;
            int[] copy = new int[size];
            for (int i = 0; i < counter; i++) {
                copy[i] = arr[i];
            }
            arr = copy;
            arr[counter++] = value;
        } else {
            arr[counter++] = value;
        }
    }

    void deleteLastElement(){
        if(counter>0){

            arr[counter-1] = 0;
            counter--;
        }
    }

    void printArray() {

        System.out.println(Arrays.toString(arr));
    }

}