package com.ing.zoo.omnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Pig extends Animal implements Omnivore, TrickPerformer {
    public String eatText;
    public String trick;

    public Pig()
    {
    }

    public void sayHello()
    {
        helloText = "oink";
        say(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        say(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        say(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        say(trick);
    }
}
