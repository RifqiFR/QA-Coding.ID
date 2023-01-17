import java.util.Scanner;

public class MembalikkanKata {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String input = myObj.nextLine();
        char[] karakter = input.toCharArray();

        for(int i = karakter.length - 1; i >= 0; i--){
            System.out.print(karakter[i]);
        }
    }
}
