import java.util.Scanner;

/*Problem : Angka Bunshin

        Angka 220 dan 284, dikatakan “angka Bunshin” karena:
        220 memiliki angka-angka pembagi (habis di bagi oleh): 1,2,4,5,10,11,20,22,44,55,110
        Dan jumlah total dari angka-angka pembagi ini adalah 284
        (1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284)
        Dan sebaliknya, jumlah total dari angka-angka pembagi 284 adalah 220
        (1 + 2 + 4 + 71 + 142 = 220)

        Input
        Jumlah bilangan Bunshin yang ingin ditampilkan (0 > x <=10)

        Proses
        Perhitungan bilangan dimulai dari 220, kemudian cari sampai input yang di minta (max: 10 bilangan)*/


public class AngkaBunshin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOutput = 0;
        int start = 220;
        int input;

        try {
            input = scanner.nextInt();
            if(input <= 0 || input > 10)
                throw new Exception();

            while (countOutput < input) {
                int totalDivisor = 0, totalBunshinDivisor = 0;

                for(int i = 1; i < start; i++) {
                    if(start % i == 0)
                        totalDivisor += i;
                }

                for(int i = 1; i < totalDivisor; i++) {
                    if(totalDivisor % i == 0)
                        totalBunshinDivisor += i;
                }
                if(totalBunshinDivisor == start && totalDivisor!=start){
                    countOutput++;
                    System.out.println( start +" Bunshin dengan " + totalDivisor);
                }
                start++;
            }
        }catch (Exception e) {
            System.out.println("Wrong Input");
        }
    }
}
