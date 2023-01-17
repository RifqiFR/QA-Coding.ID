import java.util.Scanner;

public class GantiVokalAngka {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String input = myObj.nextLine();
        char[] karakter = input.toCharArray();

        for(char kar: karakter){
            switch (kar) {
                case 'a', 'A' -> System.out.print(1);
                case 'i', 'I' -> System.out.print(2);
                case 'u', 'U' -> System.out.print(3);
                case 'e', 'E' -> System.out.print(4);
                case 'o', 'O' -> System.out.print(5);
                default -> System.out.print(kar);
            }
        }
    }
}
