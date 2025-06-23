public class LList <E> implements List <E> {
    private Link <E> head; // pointer to list head
    private Link <E> tail; // pointer to list tail
    protected Link <E> current; // pointer to current element
    int count; // size of the list

    /* constructors */
    LList(int size) {
        this();
    }

    LList (){
        // create list header
        current = head = tail = new Link <E> (null);

        // default size is 0
        count = 0;
    }
    
    // remove all elements in a linked list
    public void clear(){
        head.setNext(null); // drop access to all links
        current = tail = head = new Link<E>(null); // create a new link head
        count = 0;
    }

    public void append (E item){
        
    }
}
