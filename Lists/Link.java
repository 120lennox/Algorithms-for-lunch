package Lists;

public class Link <E> {
    private E element; // value in a linked list
    private Link <E> next; // reference to the next node in the list

    //constructors
    Link(E item, Link<E> nextval ){
        element = item;
        next = nextval;
    }

    Link (Link<E> nextval){
        next = nextval;
    }

    Link <E> next(){
        return next;
    }

    Link <E> setNext(Link<E> nextval){
       return next = nextval;
    }

    E element(){
        return element;
    }

    E setElement(E item){
        return element = item;
    }

}
