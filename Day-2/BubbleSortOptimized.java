import java.util.Arrays;

public class BubbleSortOptimized {
    
    int[] arr;
    public BubbleSortOptimized(int[] arr){
        this.arr = arr;
    }
    //[34,22,134,24,11]
    public void sort(){
        boolean swapped = false;

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    swap(j, j+1);
                }
            }
            if(swapped == false)
                System.out.println("No swap");
                break;
            }
            System.out.println(Arrays.toString(arr));


    }

    public void swap(int position1, int position2){

        int temp = arr[position2];
         arr[position2] = arr[position1];
         arr[position1] = temp;

    }
}