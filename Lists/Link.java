package Lists;

public class Link <E> {
    public E element; // value in a linked list
    public Link <E> next; // reference to the next node in the list

    //constructors
    public Link(E item, Link<E> nextval ){
        element = item;
        next = nextval;
    }

    public Link (Link<E> nextval){
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
