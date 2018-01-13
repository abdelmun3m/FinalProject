package com.abdelmun3m.jokelib;

import java.util.ArrayList;
import java.util.List;

public class Jokes {

    public static List<String> myJokes;

    public Jokes(){

        myJokes = new ArrayList<String>();


        myJokes.add("Where do you find reindeer?,It depends on where you leave them!");
        myJokes.add("Who is a Christmas tree’s favorite singer?,Spruce Springsteen");
        myJokes.add("What’s Santa’s favorite snack food?,Crisp Pringles");
        myJokes.add("How is the alphabet different on Christmas than any other day?, On Christmas, it has Noel");
        myJokes.add("Why didn’t Rudolph get a good report card?,Because he went down in History");
        myJokes.add("What Do You Sing At An Elf’s Birthday Party?,Freeze A Jolly Good Fellow!");
        myJokes.add("What cars do elves drive?,A toyYoda");
        myJokes.add("How did Scrooge win the football game?, The ghost of Christmas passed");
        myJokes.add("What do you call Santa’s helpers?,Subordinate Clauses");
        myJokes.add("What is Santa’s primary language?,North Polish");
        myJokes.add("What do reindeer say before they tell a joke?,This will sleigh you");
        myJokes.add("Why did they couple get hitched on the 24 of December?,So they could have a married Christmas");
        myJokes.add("How do you lift a frozen car?,With a Jack Frost");

    }


    public String getJoke(){

        double v = Math.floor(Math.random() * myJokes.size());
        return  myJokes.get((int) v);

    }








}
