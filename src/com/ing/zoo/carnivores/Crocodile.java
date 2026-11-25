package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Crocodile extends Animal implements Carnivore, TrickPerformer {
    public String eatText;
    public String trick;

    public Crocodile()
    {
    }

    public void sayHello()
    {
        helloText = "snap snap";
        say(helloText);
    }

    public void eatMeat()
    {
        eatText = "chomp chomp gulp";
        say(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "does a death roll";
        }
        else
        {
            trick = "lies still like a log";
        }
        say(trick);
    }
}
