import java.util.Scanner;

public class MencariVokal {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String input = myObj.nextLine();
        char[] vokal = {'a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O'};
        char[] karakter = input.toCharArray();

        for(char kar: karakter){
            for(char vok: vokal)
                if(vok == kar)
                    System.out.print(kar);
        }
    }
}
