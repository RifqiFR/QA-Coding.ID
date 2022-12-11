//Problem: Meet in the Middle
//
//        Input:
//
//        A word of String
//
//        Output:
//        Set all letter to lowercase
//        Match the first letter with the last letter and continue to the next letter until they meet in the middle and all letters get a pair.
//        If there is a letter that does not get a pair then ignore it.

import java.util.Scanner;

public class MeetInTheMiddle {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String inputLowerCase = input.toLowerCase();

        for(int i=0; i < input.length() / 2;i++){
            System.out.println(""+inputLowerCase.charAt(i) + inputLowerCase.charAt(input.length()-1-i));

        }
    }
}
