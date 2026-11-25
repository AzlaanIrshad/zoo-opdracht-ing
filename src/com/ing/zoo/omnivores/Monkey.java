package com.ing.zoo.omnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Monkey extends Animal implements Omnivore, TrickPerformer {
    public String eatText;
    public String trick;

    public Monkey()
    {
    }

    public void sayHello()
    {
        helloText = "oeoe a a";
        say(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oeoe";
        say(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom";
        say(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "swings through the trees";
        }
        else
        {
            trick = "throws banana";
        }
        say(trick);
    }
}