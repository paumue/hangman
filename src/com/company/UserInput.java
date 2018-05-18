package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    public String getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nYour next letter?\n");
        String letter = scanner.nextLine();
        return letter;

    }

    public Boolean checkDone(ArrayList<String> linelist){

        Boolean checkword = linelist.contains("_ ");

        if(checkword == false){

            System.out.println("Congrats you won!");
        }
        return checkword;
    }

    public static ReturningValues changeLinelist(String letter, String word, ArrayList<String> linelist){

        ReturningValues rv = new ReturningValues();

        ArrayList<Integer> indexlist = new ArrayList<>();


        int index = word.indexOf(letter);

        if (letter.length() > 1){

            System.out.println("Please write only one letter!");
            return rv;

        }
        if(index == -1){
            System.out.println("New letter, this one is not in the word");
        }
        else{
            System.out.println("Congrats! This letter is part of the word.");
        }
        while (index >= 0) {
            indexlist.add(index);
            index = word.indexOf(letter,index + 1);
        }

        for(int j = 0; j < indexlist.size(); j ++){

            linelist.set(indexlist.get(j),letter);
        }
        //linelist.forEach(System.out::print);
        //printing in main?

        rv.setArray(linelist);
        return rv;
    }
}


