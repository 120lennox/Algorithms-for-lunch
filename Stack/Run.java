package Stack;
public class Run {
    public static void main(String[] args) {
        Astack<String> stack = new Astack<>();

        stack.push("Lennox");
        stack.push("Regina");
        stack.push("Lauryn");
        stack.push("Jessie");
        stack.push("Sosobina");
        stack.push("Nsanje");

        // printing top value of the stack
        // System.out.println("Top value of the stack is " + stack.topValue());

        // printing all elements of the stack
        while (stack.length() != 0){
            System.out.println();
            System.out.println("Element on position " + (stack.length() - 1) + " is " + stack.pop());
            System.out.println();
        }
    }
}
