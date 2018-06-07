package Algorithm.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] test = {3,1,4,1,5,9,2,6,15,90,12,7,8};
        insertionSort(test);
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }
    }
}
