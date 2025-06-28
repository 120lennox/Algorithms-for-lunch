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

    public int leftChild(int pos){
        assert pos < (count - 1)/2 : "position has no letft child";
        return 2 * pos + 1;
    }

    public int rightChild(int pos){
        assert pos < (count - 1)/2 : "position has no letft child";
        return 2 * pos + 2;
    }



}
