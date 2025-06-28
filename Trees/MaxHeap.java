package Trees;

public class MaxHeap<E extends Comparable<? super E>> {
    private E[] heap; // pointer to heap array
    private int size; // maximum size of the heap
    private int count; // number of items in the heap

    // constructor for pre loading heap elements
    public MaxHeap(E[] pointer, int size, int count) {
        heap = pointer;
        this.size = size;
        this.count = count;
        buildheap();
    }

    public int heapSize(){
        return count;
    }

    // following the theory that a leaves are found at the other half of the array. 
    // we con say that if the pos on the other half and we are still within array bounds
    public boolean isLeaf(int pos ){
        return (pos >= count/2) && (pos < count); 
    }

    private void swap(int i, int j) {
        E temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int leftChild(int pos){
        assert pos < (count - 1)/2 : "position has no letft child"; // (count - 1)/2 is an internal node
        return 2 * pos + 1;
    }

    public int rightChild(int pos){
        assert pos < (count - 1)/2 : "position has no letft child";
        return 2 * pos + 2;
    }

    public int parent(int pos){
        assert pos > 0: "Position has no parent";
        return (pos - 1)/2;
    }

    public void insert (E item){
        assert count < size: "Heap is full";
        int current = count++;
        heap[current] = item;
        
        while((current != 0) && heap[current].compareTo(heap[parent(current)]) > 0){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // heapify contents of the heap
    public void buildheap(){
        for (int i = count/2-1; i >=0; i--) siftdown(i); // starting on the last non-leaf node (half of the array)
    }

    private void siftdown(int pos){
        assert (pos >= 0) && (pos < count): "illegal heap position"; 
        while (!isLeaf(pos)){
            int j = leftChild(pos);
            if ((j < (count - 1)) && heap[j].compareTo(heap[j + 1]) > 0){
                j++;
            }
            if (heap[pos].compareTo(heap[j]) > 0) return;
            swap(pos, j);
            pos = j;
        }
    }

}
