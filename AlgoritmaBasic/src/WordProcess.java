/*Problem Word Process

Change the following words to be a word based on the position of the character replacement

Input
A sentence

Output
A word without whitespace*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordProcess {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        input = input.toLowerCase().replaceAll("\\s", "");
        char[] charArray = input.toCharArray();
        ArrayList<Character> uniqueChars = new ArrayList();
        HashMap<Character, Integer> charCount = new HashMap();

        for (char chara: charArray){
            charCount.putIfAbsent(chara, 0);
            charCount.replace(chara, charCount.get(chara)+1);
            if(!uniqueChars.contains(chara))
                uniqueChars.add(chara);
        }

        for(char keyChar: uniqueChars){
            for(int i = 0; i < charCount.get(keyChar);i++){
                System.out.print(keyChar);
            }
        }
    }
}
