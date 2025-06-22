
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
        
    }

}
