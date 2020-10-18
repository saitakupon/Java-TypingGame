package module.run;

import java.util.Scanner;

public class Run {
    public static void showQuestion(String[] words, int index) {
        System.out.println(words[index]);
    }
    public static String getUsersInput() {
        Scanner stdIn = new Scanner(System.in);
        String ans = stdIn.next();
        return ans;
    }
    public static boolean checkEqual(String word, String ans) {
        if (word.equals(ans)) return true;
        else return false;
    }
    public static void game(String[] words) {
        for (int i = 0; i < words.length; i++) {
            showQuestion(words, i);
            while (!checkEqual(words[i], getUsersInput())) {
                showQuestion(words, i);
            }
        }
    }
}
