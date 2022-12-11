import java.util.Scanner;

/*
Multiple 3 and 7

        Find the sum of number that can be divided by 3 or 7 between 1 - (x_input). Example : x_input =  10, so the sum is 25 (3 + 6 + 7 + 9).

        Input :

        One number (x_input) where (x_input) is a positive integer (Max.50).

        Output :

        The sum of number that can be divided by 3 or 7 between 1 - (x_input).
*/



public class Mutiple3And7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer input = null;

        try {
            input = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong Input");
            return;
        }
        if (input > 50 || input < 0) {
            System.out.println("Max.Input is 50");
            return;
        }

        int sum = 0;
        for(int i = 1; i <= input; i++) {
            if(i % 3 == 0 || i % 7 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
