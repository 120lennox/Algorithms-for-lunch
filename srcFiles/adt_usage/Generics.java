package srcFiles.adt_usage;
import adt_implementations.Object1;

public class Generics {
    public static void main(String args[]){
        Object1 word = new Object1();

        word.set('Hello world');
        System.out.println(word.get());
    }
}
