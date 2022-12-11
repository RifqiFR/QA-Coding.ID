import java.util.Scanner;

/*Problem: XO Lines

        Input:
        Integer between 1 - 40.

        Output:
        Lines that formed by “X” OR “O” as below*/

public class XOLines {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        //if statement
        if(input>=1 && input <= 40){
            for(int i = 1; i <=input; i++ ){
                if(i%2 == 1){
                    System.out.print("X");
                }else{
                    System.out.print("O");
                }
            }

        }else{
            System.out.println("Wrong Input");
        }
    }
}
