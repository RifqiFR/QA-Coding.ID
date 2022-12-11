/*Soal
Create a function that takes a string and returns a new string with each new character accumulating by +1.
Separate each set with a dash. Capitalize the first letter of each set.*/

import java.util.Scanner;

public class Compounding {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        //input
        //looping berdasarkan panjang input
        //looping berdasarkan index

        for(int i=0; i<input.length(); i++ ){
            for(int j=0; j<=i; j++){
                if(j==0){
                    System.out.print(""+Character.toUpperCase(input.charAt(i)));
                }else System.out.print(""+Character.toLowerCase(input.charAt(i)));
            }
            if (input.length()==i+1){
                System.out.print("-");
            }
        }
    }
}