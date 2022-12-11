import java.util.Scanner;
/*Arithmetic Series

        Given the pattern of arithmetic series as been the pattern of arithmetic series as below

        2 5 7 3 6 8 4 7 9

        2 + 1 = 3

        5 + 1 = 6

        7 + 1 = 8

        Input :

        One number (N) where (N) is a positive integer (>0).

        Output :

        The arithmetic series corresponds to the number of numbers entered and if the number is multiple 3  would be print Tik, if the number is multiple 5 would be print Tak,
        and if a number can divisible by 3 and 5 will be print Boom.
        2 5 7 3 6 8 4 7 9 5 8 10 6 9 11 7 10 12 8 11 13 9 12 14 10 13 15
        2 Tak 7 Tik Tik 8 4 7 Tik Tak 8 Tak Tik Tik 11 7 Tak Tik 8 11 13 Tik Tik 14 Tak 13 Boom*/

public class AritmeticSeries3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer input = null;
        int[] deret = {2, 5, 7};

        try {
            input = scan.nextInt();

            if(input<=0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Wrong Input");
            return;
        }

        for(int i = 0; i < input; i++) {
            int number = deret[i % 3];

            if(number % 3 == 0 && number % 5 == 0)
                System.out.print("Boom");
            else if(number % 3 == 0)
                System.out.print("Tik");
            else if(number % 5 == 0)
                System.out.print("Tak");
            else
                System.out.print(number);

            deret[i % 3]++;
            if(i - 1 < input)
                System.out.print(" ");
        }
    }
}
