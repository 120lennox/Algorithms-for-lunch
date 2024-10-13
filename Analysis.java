public class Analysis{
    public static void analysis1(){
        int sum = 0;
        int k = 20;
        for (int i = 1; i <= k; i*= 2){
            sum ++;
        }

        System.out.println("executed " + sum + " times");
    }

    public static void main(String args[]){
        analysis1();
    }
}