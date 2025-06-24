package Lists;
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

    public E remove(){
        // if there is no element on current position, return null
        if ((currentPosition < 0) || (currentPosition >= listSize)) return null;

        E item = listArray[currentPosition]; // copy the element at the current position

        for (int i = currentPosition; i < listSize - 1; i++){
            listArray[i] = listArray[i + 1]; // copies the next element to previous position
        }
        listSize--;
        return item;
    }

    public void moveToStart(){currentPosition = 0; }

    public void moveToEnd(){currentPosition = listSize; }

    public void prev(){
        if (currentPosition != 0) currentPosition--;
    }

    public void next(){
        if (currentPosition != listSize) currentPosition++;
    }

    public int length(){
        return listSize;
    }

    public int currentPos(){
        return currentPosition;
    }

    // jumping straight to certain position
    public void moveToPos(int pos){
        assert (pos >= 0) && (pos <= listSize) : "Pos out of range";
        currentPosition = pos;
    }

    public E  getValue(){
        assert (currentPosition >= 0) && (currentPosition <= listSize) : "No current element";
        return listArray[currentPosition];
    }
}
