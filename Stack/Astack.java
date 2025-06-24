package Stack;

public class Astack<E> implements Stack<E> {
    private static int defualt_size = 20; // default size of the stack

    private int maxSize;
    private int top;

    private E[] listArray;

    Astack(){
        this(defualt_size);
    }

    Astack(int size){
        maxSize = 0;
        top = 0;
        listArray = (E[]) new Object[size];

    }

    public void clear (){
        top = 0;
    }

    public void push(E item){
        assert top != maxSize: "Stack is full";
        listArray[top++] = item;
    }

    public E pop(){
        assert top != 0: "Stack is empty";
        return listArray[top--];
    }

    public E topValue(){
        assert top != 0: "Stack is empty";
        return listArray[top - 1];
    }

    public int length(){
        return top;
    }
}
