package Stack;
import Lists.Link;

public class LStack<E> implements Stack {
    private Link<E> top;
    private int size;

    public LStack(){
        top = null;
        size = 0;
    }

    public LStack(int size){
        top = null;
        size = 0;
    }

    public void clear(){
        top = null; size = 0;
    }

    public void push(E item){
        top = new Link<E>(item, top);
        size ++;
    }

    public E pop(){
        assert top != null: "Stack is empt";
        E item = top.element()
        top = top.next();
        size --;
        return item;
    }

    public E topValue(){
        assert top != null: "Stack is empty";
        return top.element();
    }

    public int length(){
        return size;
    }



}
