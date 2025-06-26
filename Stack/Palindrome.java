package Stack;

public class Palindrome {
    public static boolean isPalindrome(String str){

        if (str == null || str.length() <= 1) return true;

        Astack<Character> stack = new Astack<Character>();
        int length = str.length();
        
        // push first half of the string onto the stack
        for (int i = 0; i < length/2; i++){
            stack.push(str.charAt(i));
        }

        // second half of the string 
        int middle = (length % 2 == 0) ? length/2 : (length/2) + 1;

        // compare second half with the first half in the stack

        for (int i = middle; i < length; i++){
            char stackCharacter = stack.pop();
            char stringCharacter = str.charAt(i);

            if (stackCharacter != stringCharacter) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("lennox is palindrome? " + isPalindrome("lennox"));
    }
}
