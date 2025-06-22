
public class AList<E> implements List<E> {
    private static final int defaultSize = 10;
    private int maxSize;
    private int currentPosition;
    private int listSize;
    private E[] listArray;

    // constractors 
    AList() {
        this (defaultSize);
    }

    @SuppressWarnings("unchecked")
    AList(int size){
        maxSize = size;
        listSize = currentPosition = 0;
        listArray = (E[]) new Object[size];
    }

    public void clear(){
        listSize = currentPosition = 0;
    }

    public void insert(E item){
        assert listSize < maxSize : "List capacity exceeded";

        // shifting elements to the right to make room
        for (int i = listSize; i > currentPosition; i--){
            listArray[i] = listArray[i - 1]; // copies an element on position i-1 to position i. process continues untill i equals currentPosition
        }
        listArray[currentPosition] = item;
        listSize++;
    }

    public void append(E item){
        assert listSize < maxSize : "List capacity exceeded";

        // adds element at the end of the list
        listArray[listSize++] = item;
    }

}
