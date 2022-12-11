import java.util.Scanner;

/*
Problem : Count Divisors (T)
        You have been given 3 integers l, r and k in a string variable.
        Find how many numbers between l and r are divisible by k. You do not need to print these numbers, you just have to find their count (sum).
*/

public class CountDivisors {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int k = scan.nextInt();

        int count = 0;

        //looping
        for(int i = l+1; i<r; i++){
            if(i%k == 0){
                count += i;
            }
        }
        System.out.println(count);
    }
}
