import java.util.Scanner;
/*Page numbering

        For numbering m pages in the book, n digits were used. By given n output the corresponding m or 0 if there is no solution. Numbering starts from the first page.
        Example 1: 13 numbers can make 11 Pages for a book

        1 2 3 4 5 6 7 8 9 10 11

        (The used number in this series of number is 13 number)

        Example 2: 12 numbers can’t make the last page which page 11, you need 13 numbers

        1 2 3 4 5 6 7 8 9 10 1

        Input

        The only number n ( > 0)

        Output

        Print the number of pages in the book.*/

public class PageNumbering {
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

        if(input<=0){
            System.out.println("Wrong Input");
            return;
        }

        int outputBil = 0;
        for (Integer i = 1; input>0; i++){
            input -= i.toString().length();
            if(input>=0){
                outputBil++;
            }
            else {
                System.out.println(0);
                return;
            }
        }
        System.out.println(outputBil);
    }
}
