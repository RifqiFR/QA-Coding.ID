/*
You have been given a String S.
You need to find and print whether this string is a podowae or not.
If yes, print "YES" (without quotes), else print "NO" (without quotes). No case sensitive and exclude whitespace.
*/


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase().replaceAll(" ", "");
        podowae(input);
    }

    static void podowae(String original){
        String reverse ="";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}