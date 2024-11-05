package type;

import type.Listo;

public class Main {
    public static void main(String[] args) {
        Listo<String> what = new Listo<String>();

        what.set("Hello world");
        System.out.println(what.get());
    }
}
