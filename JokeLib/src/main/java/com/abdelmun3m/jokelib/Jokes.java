package com.abdelmun3m.jokelib;

import java.util.ArrayList;
import java.util.List;

public class Jokes {

    public static List<String> myJokes;

    public Jokes(){

        myJokes = new ArrayList<String>();


        myJokes.add("this is my 0 joke");
        myJokes.add("this is my 1 joke");
        myJokes.add("this is my 2 joke");
        myJokes.add("this is my 3 joke");
        myJokes.add("this is my 4 joke");
        myJokes.add("this is my 5 joke");
        myJokes.add("this is my 6 joke");
        myJokes.add("this is my 7 joke");
        myJokes.add("this is my 8 joke");
        myJokes.add("this is my 9 joke");
        myJokes.add("this is my 10 joke");
        myJokes.add("this is my 11 joke");
        myJokes.add("this is my 12 joke");

    }


    public String getJoke(){

        double v = Math.floor(Math.random() * myJokes.size());
        return  myJokes.get((int) v);

    }








}
