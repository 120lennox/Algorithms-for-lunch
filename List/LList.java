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
        tail = tail.setNext(new Link<E>(item, null)); // add an item on the tail and set it to point to null
        count++;
    }

    public void insert(E item){
        current.setNext(new Link<E>(item, current.next())); // insert an item at the current position
        // move the current pointer to the newly inserted item
        if (tail == current){ 
            current.next(); 
        }
        count++;
    }

    public E remove(){
        // if current position has nothing, dont remove
        if (current == null){
            return null;
        }

        E item = current.next().element();

        if (tail == current.next()) tail = current;
        current.setNext(current.next().next()); // set the current item to point to the next item
        count--;
        return item;
    }

    public void moveToStart(){
        current = head;
    }

    public void moveToEnd(){
        current = tail;
    }

    public void prev(){
        if (current == head) return ;

        Link<E> temp = head;

        /* keep traversing in the linked list untill we find a node that points to the current node */
        while (temp.next() != current) {temp = temp.next(); } 
        current = temp;
    }

    public void next(){
        if (current != tail){
            current = current.next();
        }
    }

    public int length(){
        return count;
    }
    
}
