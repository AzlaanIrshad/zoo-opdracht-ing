package com.ing.zoo.omnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Monkey extends Animal implements Omnivore, TrickPerformer {
    public Monkey(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        say("oeoe a a");
    }

    public void eatLeaves()
    {
        say("munch munch oeoe");
    }

    public void eatMeat()
    {
        say("nomnomnom");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            say("swings through the trees");
        }
        else
        {
            say("throws banana");
        }
    }
}