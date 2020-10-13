package module.prepare;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.LineNumberReader;

import java.util.Scanner;
import java.util.Random;

public class Prepare {
    public static int questionNum() {
        Scanner stdIn = new Scanner(System.in);
        System.out.printf("Choose Mode\n[0 -> easy, 1 -> normal, 2 -> hard] : ");
        if (stdIn.nextInt() == 0) return 3;
        else if (stdIn.nextInt() == 1) return 30;
        else return 50;
    }
    public static String[] textFileReader(String filePath) {
        int WORDS_NUM = 0;
        File file = new File(filePath);
        try (LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {
            while (lnr.readLine() != null) {
                WORDS_NUM++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        String[] words = new String[WORDS_NUM];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i < WORDS_NUM; i++) {
                words[i] = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return words;
    }
    public static String[] getRandWords(String[] words, int n) {
        Random rand = new Random();
        String[] selectedWords = new String[n];
        for (int i = 0; i < n; i++) {
            selectedWords[i] = words[rand.nextInt(words.length)];
        }
        return selectedWords;
    }
    public static String[] question(String filePath) {
        return getRandWords(textFileReader(filePath), questionNum());
    }
}