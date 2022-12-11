/*Mirror prime numbers
We will call a number "mirror prime", if it is prime, and the number written in reverse order is also prime. Defined the number of "mirror primes"
Input An Integer (10 ≤ a ≤ 100).
Output
Print "Mirror Primes" for a is Mirror Prime Number. And print “Regular Number” for a isn’t Mirror Prime Number*/

import java.util.Scanner;

public class MirrorPrimeNumber {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        Integer input = null;

        try {
            input = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong Input");
            return;
        }

        if (input < 10 || input > 100) {
            System.out.println("Wrong Input");
            return;
        }

        int bilPertama = input / 10;
        int bilKedua = input % 10;
        int bilBaru = bilKedua * 10 + bilPertama;

        if (prima(input) && prima(bilBaru)) {
            System.out.println("Mirror Primes");
        } else System.out.println("Regular Number");
    }

    static boolean prima(int bil){
        int cek = 0;
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            return true;
        }else {
            return false;
        }
    }
}
