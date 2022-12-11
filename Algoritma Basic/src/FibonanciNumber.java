import java.util.Scanner;
/*Star Fibo

        The Fibonacci sequence corresponds to the number of numbers entered if the number is a multiple of the second input it will print  " * " without double quotes. lenght of input <= 100 and limit of number >=0 .

        Example

        input : 0 > input <=50

        5

        2



        output :
        1 2 3 5 8 => 5 numbers
        1 * 3 5 * => 2 & 8 change to "*" because 1&8 is a multiple of 2*/
public class FibonanciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer inputPertama = null;
        Integer inputKedua = null;

        try {
            inputPertama = scan.nextInt();
            inputKedua = scan.nextInt();

            if ((inputPertama <= 0 || inputPertama > 50) ||
                    (inputKedua <= 0 || inputKedua > 50))
            {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Wrong Input");
            return;
        }

        int bilBeforeLoop1 = 2;
        int bilBeforeLoop2 = 1;

        int bilFibo = 0;
        for(int i = 0; i<inputPertama; i++){
            if(i==0){
                bilFibo = 1;
            }
            else if (i==1){
                bilFibo = 2;
            }else {
                bilFibo = bilBeforeLoop1 + bilBeforeLoop2;
                bilBeforeLoop2 = bilBeforeLoop1;
                bilBeforeLoop1 = bilFibo;
            }
            if(bilFibo%inputKedua==0){
                System.out.printf("*");
            }else System.out.print(bilFibo);

            if(i - 1 < inputPertama)
                System.out.print(" ");
        }
    }
}
