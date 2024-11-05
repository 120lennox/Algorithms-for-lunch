package src.implementations;

import src.abstractions.Object1;

public class Generics {
    public static void main(String[] var){
        Object1 temp = new Object1();

        temp.set("Hello world");
        System.out.println(temp.get());
    }
}
