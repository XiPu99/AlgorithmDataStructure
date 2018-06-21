package Algorithm.Sorting;

public class QuickSort {

    // use quickSort by calling quickSort(arr, 0, arr.length-1)
    public static void quickSort(int[] arr, int p, int r){
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    public static int partition(int[] arr, int p, int r){
        int mid = arr[r];
        int boundary = p - 1;
        for(int i = p; i < r; i++){
            if(arr[i]<=mid){
                boundary++;
                // swap arr[i] and arr[boundary]
                int temp = arr[boundary];
                arr[boundary] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[boundary+1];
        arr[boundary+1] = arr[r];
        arr[r] = temp;
        return boundary+1;
    }

    public static void main(String[] args) {
        int[] test = {13,19,9,5,12,8,7,4,21,2,6,11};
        QuickSort.quickSort(test,0,test.length-1);
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }
    }
}
