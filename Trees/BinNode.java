package Trees;

public interface BinNode<E> {
    public E element();

    public void setElement(E value);

    public BinNode<E> left(); // left child

    public BinNode<E> right(); // right child

    public boolean isLeaf(); // is this node a leaf node?
}
