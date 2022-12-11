import java.util.Scanner;

/*Problem: Number Row
        Input:
        N Integer
        sort type (Desc / Asc)

        Output:
        Number rows from 1 to N base on the sort type as below*/

public class NumberRow {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String inputInts = scan.nextLine();
        String inputSort = scan.nextLine();
        int inputInt = 0;

        try {
            inputInt = Integer.parseInt(inputInts);
        } catch (Exception e) {
            System.out.print("Wrong Input");
        }

        if(inputSort.equals("Asc")) {
            for(int i = 1; i <= inputInt; i++) {
                System.out.print(i);
                if(i != inputInt)
                    System.out.print(" ");
            }
        } else if (inputSort.equals("Desc")){
            for(int i = inputInt; i >= 1; i--) {
                System.out.print(i);
                if(i != 1)
                    System.out.print(" ");
            }
        } else
            System.out.print("Wrong Input");
    }
}
