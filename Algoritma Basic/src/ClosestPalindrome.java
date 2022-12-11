/*Problem: Closest Palindrome

Find closest palindrome form input, input must be number. If they have same length get the lowest number.

example :
Input : 153

151 152 153 154 155

Output : 151

example :

Input : 121

111   112   113   114   115   116   117   118   119   120   121   122   123   124   125   126   127   128   129   130   131

Output : 111*/

import java.util.Scanner;

public class ClosestPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        try {
            input = scan.nextInt();
            closestPalindrome(input);
        } catch (Exception e) {
            System.out.print("Wrong Input");
        }
    }

    // Function to check Palindrome
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            if (s.charAt(left) !=
                    s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function return closest Palindrome number
    public static void closestPalindrome(int num)
    {

        // Case1 : largest palindrome number
        // which is smaller to given number
        int RPNum = num - 1;

        while (isPalindrome(Integer.toString(RPNum)) == false)
        {
            RPNum--;
        }

        // Case 2 : smallest palindrome number
        // which is greater than given number
        int SPNum = num + 1;

        while (isPalindrome(Integer.toString(SPNum)) == false)
        {
            SPNum++;
        }

        // Check absolute difference
        if (Math.abs(num - SPNum) <
                Math.abs(num - RPNum))
        {
            System.out.println("Closet Palindrome : "+SPNum);
        }
        else
            System.out.println("Closet Palindrome : "+RPNum);
    }
}
