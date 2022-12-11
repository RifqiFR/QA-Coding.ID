import java.util.Scanner;
//Problem: Min Max
//        There are 2 input positive integers less than 50,
//        if both inputs have the same remainder of the divisor of 5 then print the largest value,
//        but if the remainder is not equal then print the smallest value.
//        If the input values are the same, then print "Same Input".

//        Input:
//        input > 0, must be number.


public class MinMax {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        int inputInt1, inputInt2;

        if(input1.equals(input2)){
            System.out.println("Same Input");
            return;
        }

        try {
            inputInt1 = Integer.parseInt(input1);
            inputInt2 = Integer.parseInt(input2);
        } catch (Exception e) {
            System.out.println("Wrong Input");
            return;
        }

        if(inputInt1 >= 50 || inputInt1 <= 0 ||
                inputInt2 >= 50 || inputInt2 <= 0
        ){
            System.out.println("Wrong Input");
            return;
        }

        if(inputInt1 % 5 == inputInt2 % 5) {
            System.out.println(Math.max(inputInt1, inputInt2));
        } else {
            System.out.println(Math.min(inputInt1, inputInt2));
        }
    }
}

