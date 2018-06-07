/*
    Implementation of a max heap and related operations
 */

package Data_Structure.Heap;

public class MaxHeap {

    public int heapSize;
    public int[] maxHeap;

    // initialize an empty heap; call buildMaxHeap to create a max heap
    public MaxHeap(){
        maxHeap = new int[0];
        heapSize = maxHeap.length;
    }

    public static int parent(int index) {
        return (index-1) / 2;
    }

    public int left(int index) {
        return 2 * index + 1;
    }

    public int right(int index) {
        return 2 * index + 2;
    }

    public void maxHeapify(int[] heap, int index){

        if(index>=heapSize){
            throw new java.lang.Error("Index is outside of heap size");
        }
        int leftIndex = left(index);
        int rightIndex = right(index);
        int largest = index;
        if(leftIndex<heapSize && heap[leftIndex] > heap[index]){
            largest = leftIndex;
        }
        if(rightIndex<heapSize && heap[rightIndex] > heap[largest]){
            largest = rightIndex;
        }

        if(largest!=index){
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            maxHeapify(heap, largest);
        }

    }

    /* The iterative version of maxHeapify */
    public void maxHeapifyIterative(int[] heap, int index){
        while(index<heapSize){
            int leftIndex = left(index);
            int rightIndex = right(index);
            int largest = index;
            if(leftIndex<heapSize && heap[leftIndex] > heap[index]){
                largest = leftIndex;
            }
            if(rightIndex<heapSize && heap[rightIndex] > heap[largest]){
                largest = rightIndex;
            }

            if(largest!=index){
                int temp = heap[index];
                heap[index] = heap[largest];
                heap[largest] = temp;
                index = largest;
            }
            else{
                break;
            }
        }
    }

    public void buildMaxHeap(int[] heapToBuild){
        heapSize = heapToBuild.length;

        for(int i = (heapSize/2) - 1; i >= 0; i--){
            maxHeapify(heapToBuild, i);
//            maxHeapifyIterative(heapToBuild, i);
        }
        maxHeap = heapToBuild;
    }

    public void heapSort(){
        while(heapSize>=2){
            int temp = maxHeap[0];
            maxHeap[0] = maxHeap[heapSize-1];
            maxHeap[heapSize-1] = temp;
            heapSize--;
            maxHeapify(maxHeap,0);
        }
    }

    public void printHeapArray(){
        for(int i = 0; i < maxHeap.length; i++){
            System.out.print(maxHeap[i] + " ");
        }
        System.out.println();
    }

    public int getHeapSize(){
        return heapSize;
    }

    public int getHead(){
        return maxHeap[0];
    }

    public int[] getArray(){
        return maxHeap;
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        int[] test = {1,2,3,4,5};
        heap.buildMaxHeap(test);
        heap.printHeapArray();
        heap.heapSort();
        heap.printHeapArray();
    }

}
