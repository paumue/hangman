// ask for letter, if letter is in there print it above line,
// otherwise print letter already used, and print hangman
//


package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        UserInput ui = new UserInput();
        GetWord gw = new GetWord();

        ArrayList<String> linelist = new ArrayList<>();

        gw.computeWord();
        String word = ReturningValues.getWord();
        linelist = ReturningValues.getArray();
        System.out.println(word);

        while (ui.checkDone(linelist) == true) { //later write condition here as long as game is going on, right guess, killed

            linelist = ReturningValues.getArray();
            linelist.forEach(System.out::print);
            String letter = ui.getInput();
            ui.changeLinelist(letter, word, linelist);









        }
    }
}