import java.util.Scanner;

public class GanjilMenurun {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int input = myObj.nextInt();

        System.out.print("[");
        for(int i = input; i > 0; i--) {
            if(i % 2 == 1) {
                System.out.print(i);
                if(i != 1)
                    System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
