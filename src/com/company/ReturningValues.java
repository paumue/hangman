package com.company;

import java.util.ArrayList;

public class ReturningValues {

    public static String word;
    public static ArrayList<String> linelist = new ArrayList<>();

    public void setWord(String word){
        this.word = word;
    }

    public void setArray(ArrayList<String> linelist){



        this.linelist = linelist;
    }



    public static String getWord(){

        return word;
    }

    public static ArrayList<String> getArray(){

        return linelist;
    }

}
