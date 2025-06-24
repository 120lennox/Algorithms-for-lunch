/*
 * Run: tests Alist and Linked List implementations
 */

public class Run {
    public static void main(String[] args) {
        AList<String> array_list1 = new AList<>();
        LList<Integer> linked_list = new LList<>();

        // array_list1.insert("lennox");
        // array_list1.insert("Mountain");
        // array_list1.append("appended item");
        // array_list1.moveToPos(2);
        // array_list1.insert("Lauryn");
        // System.out.println("name is " + array_list1.getValue());

        for (int i = 2; i < 10; i++) {
            linked_list.insert(i);
        }

        // System.out.println(linked_list.currentPos());
        
        // //printing value at current position
        // System.out.println(linked_list.getValue());

        linked_list.insert(29);

        linked_list.moveToStart();
        for (int i = 0; i < linked_list.length(); i++){
            System.out.println("Current position: " + linked_list.currentPos() + " Value: " +linked_list.getValue());
            linked_list.moveToPos(i);
        }
        System.out.println();
        System.out.println("Previous value");

        linked_list.prev();
        linked_list.prev();
        System.out.println("Current position: " + linked_list.currentPos() + " Value: " + linked_list.getValue());

    }
}
