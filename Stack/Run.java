package Stack;
public class Run {
    public static void main(String[] args) {
        Astack<String> stack = new Astack<>();
        LStack<Integer> stack2 = new LStack<>();

        stack.push("Lennox");
        stack.push("Regina");
        stack.push("Lauryn");
        stack.push("Jessie");
        stack.push("Sosobina");
        stack.push("Nsanje");

        stack2.push(1);
        stack2.push(2);
        System.out.println("Linked stack top element " + stack2.topValue());

        // printing top value of the stack
        System.out.println("Top value of the stack is " + stack.topValue());

        printing all elements of the stack
        while (stack.length() != 0){
            System.out.println();
            System.out.println("Element on position " + (stack.length() - 1) + " is " + stack.pop());
            System.out.println();
        }
    }
}
