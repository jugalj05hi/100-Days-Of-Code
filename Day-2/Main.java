public class Main {

    public static void main(String args[]){
        
        int[] array = {1,2,3,4,5,6};
       
        BubbleSort sort = new BubbleSort(array);
        BubbleSortOptimized sort2 = new BubbleSortOptimized(array);
        sort2.sort();

        // sort.sort();
    
    }
    
}