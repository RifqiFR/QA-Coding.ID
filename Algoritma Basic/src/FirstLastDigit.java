import java.util.Scanner;
//Problem: First and Last Digit
//        Input:
//        N Integer

//        Output:
//        First Digit of N and Last Digit of N


public class FirstLastDigit {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}