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

    public boolean isLeaf(int pos ){
        return (pos >= count/2) && (pos < count);
    }

    

}
