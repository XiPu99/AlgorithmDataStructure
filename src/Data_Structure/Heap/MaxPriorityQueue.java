/*
    Implementation of max priority queue using a max heap
 */

package Data_Structure.Heap;

public class MaxPriorityQueue {
    MaxHeap maxHeap;
    int[] heapArray;

    public MaxPriorityQueue(){
        maxHeap = new MaxHeap();
        heapArray = maxHeap.getArray();
    }

    public MaxPriorityQueue(MaxHeap mh){
        maxHeap = mh;
        heapArray = mh.getArray();
    }


    // assume that input is a max heap
    public static int max(MaxHeap heap){
        return heap.maxHeap[0];
    }

    public int extractMax(MaxHeap heap){
        int[] heapArr = heap.maxHeap;
        int max = heapArr[0];
        heapArr[0] = heapArr[heap.heapSize-1];
        heapArr[heap.heapSize-1] = max;
        heap.maxHeapify(heapArr, 0);
        heap.heapSize--;
        return max;
    }

    public void increaseKey(int[] heap, int index, int key){
        if(heap[index]>key){
            throw new java.lang.Error("Trying to decrease the key value");
        }
        heap[index] = key;
        while(heap[index]>heap[MaxHeap.parent(index)]){
            int temp = heap[MaxHeap.parent(index)];
            heap[MaxHeap.parent(index)] = heap[index];
            heap[index] = temp;
            index = MaxHeap.parent(index);
        }
    }

    public void insertKey(MaxHeap heap, int key){
        heap.heapSize++;
        heap.maxHeap[heap.heapSize-1] = Integer.MIN_VALUE;
        increaseKey(heap.maxHeap, heap.heapSize-1,key);
    }

    public void printPriorityQueue(){
        for(int i = 0; i < heapArray.length; i++){
            System.out.println(heapArray[i]);
        }
    }

    public static void main(String[] args) {
        MaxHeap test = new MaxHeap();
        test.buildMaxHeap(new int[]{1,2,3,4,5});
        MaxPriorityQueue pq = new MaxPriorityQueue(test);
        pq.printPriorityQueue();
//        pq.insertKey(pq.maxHeap, 7);
//        pq.printPriorityQueue();
    }
}
