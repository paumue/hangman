package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

public class GetWord {

    private static final String FILENAME = "/Users/paul/IdeaProjects/Hangman/google-10000-english.txt";

    public static ReturningValues computeWord()

    {


        BufferedReader br = null;
        FileReader fr = null;
        ReturningValues rv = new ReturningValues();

        try {

            br = new BufferedReader(new FileReader(FILENAME));

            ArrayList<String> wordlist = new ArrayList<>();
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {

                wordlist.add(sCurrentLine);
            }

            int itemCount = wordlist.size();
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(itemCount);
            String word = wordlist.get(randomInt);
            rv.setWord(word);
            int wordlength = word.length();
            ArrayList<String> linelist = new ArrayList<>();

            for (int i = 0; i < wordlength; i++) {
                linelist.add("_ ");
            }
            rv.setArray(linelist);
            //print in here or in main?
            //linelist.forEach(System.out::print);

            return rv;

        } catch (IOException e) {

            e.printStackTrace();
        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    return rv;
    }
}