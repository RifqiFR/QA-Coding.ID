import java.util.Scanner;

public class GanjilGenapKarakter {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String input = myObj.nextLine();

        if(input.length() % 2 == 0)
            System.out.println("Genap");
        else
            System.out.println("Ganjil");
    }
}
