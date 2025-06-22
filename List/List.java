//LIST ADT
public interface List<E>{
    public void clear();

    // inserts an item at the current position
    public void insert (E item);

    // adds an item at the end of the list
    public void append(E item);

    //removes an item at the current position
    public E remove();

    //shifts an item at the current posisiotn to move to start
    public void moveToStart();

    //shifts item at current position to end
    public void moveToEnd();

    // move left
    public void prev();

    // move right 
    public void next();

    // returns number of items in the list
    public int length();

    // returns the position of the current item
    public int currentPosition();

    //sets the current position
    public void moveToPos(int pos);

    // return an element on the current position
    public E getValue();
}