import java.util.ArrayList;
import java.util.Scanner;

public class DevideConquer {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        /*
            Devide and Conquer
            1. Ada input 1 string, tapi perlu dipecah jadi 3 angka (V)
            2. Saya perlu looping between angka 1 dan angka 2 (V)
            3. Saya cek looping di poin 2, yang habis di dibagi angka 3, saya sum semua (V)
            4. Print out hasil poin 3 (V)
        */

        ArrayList<Integer> numInput = new ArrayList<Integer>();
        for (String s : input.split(" ")) {
            numInput.add(Integer.parseInt(s));
        }

        int sum = 0;
        for(int x = numInput.get(0) + 1; x<numInput.get(1) ; x++){
            if(x % numInput.get(2) == 0){
                sum += x;
            }

        }
        System.out.println(sum);
    }
}

