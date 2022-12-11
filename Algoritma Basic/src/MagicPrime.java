
/*The number 443 has an interesting property (Magic Prime). Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 443, 43, and 3
       443 => prime number
        43 => prime number
         3 => prime number
so, 443 is Magic Prime number. Start at 100.*/

import java.util.Scanner;

public class MagicPrime {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int start = 100;

        for(int i=1; i <= input; i++){
            boolean belumPrima = true;
            while(belumPrima){
                int bilCek = start;
                if (prima(bilCek)){
                    if(prima(bilCek%100)){
                        bilCek = bilCek%100;
                        if(prima(bilCek%10)){
                            System.out.println("#"+i+" Number => "+start);
                            belumPrima = false;
                        }
                    }
                }
                start++;
            }
        }
    }

    static boolean prima(int bil){
        int cek =0;
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


