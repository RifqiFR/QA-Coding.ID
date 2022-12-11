import java.util.Scanner;

/*Number Only

        Given a string, sum the numbers that appear in the string and ignore all other characters.



        Example:

        51oco1 = 51 + 1 = 52

        5hoco1a1e =  5 + 1 + 1 = 7*/

public class NumberOnly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum = 0;

        for(int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                int j = i;
                while(j + 1 < input.length()) {
                    if(Character.isDigit(input.charAt(j + 1)))
                        j++;
                    else
                        break;
                }

                sum += Integer.parseInt(input.substring(i, j + 1));
                i = j;
            }
        }

        System.out.println(sum);
    }
}
