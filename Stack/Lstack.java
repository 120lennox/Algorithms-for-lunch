package Stack;
import List.Link;
public class Lstack {
    private Link<E> top;
    private int size;

    LStack (){
        top = null;
        size = 0;
    }

    LStack(int size){
        top = null;
        size = 0;
    }

    public void clear(){
        top = null;
        size = 0;
    }

    public void push(E item){
        top = new Link<E>(item, top);
        size++;
    }
}
