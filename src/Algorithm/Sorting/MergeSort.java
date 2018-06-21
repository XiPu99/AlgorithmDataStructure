package Algorithm.Sorting;

public class MergeSort {

    public static void mergeSort(int[] arr, int p, int r){
        if(p < r){
            int mid = (p + r) / 2;
            mergeSort(arr, p, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, p, mid, r);
        }
    }

    public static void merge(int[] arr, int p, int mid, int r){
        int[] left = new int[mid-p+1+1];
        int[] right = new int[r-mid+1];
        for(int i = 0; i < left.length - 1; i++){
            left[i] = arr[p+i];
        }
        for(int i = 0; i < right.length - 1; i++){
            right[i] = arr[mid+i+1];
        }
        left[left.length-1] = Integer.MAX_VALUE;
        right[right.length-1] = Integer.MAX_VALUE;
        int l = 0;
        int rt = 0;
        for(int i = p; i <= r; i++){
            if(left[l] <= right[rt]){
                arr[i] = left[l];
                l++;
            }
            else{
                arr[i] = right[rt];
                rt++;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {13,19,9,5,12,8,7,4,21,2,6,11};
        mergeSort(test,0,test.length-1);
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }
    }

}
