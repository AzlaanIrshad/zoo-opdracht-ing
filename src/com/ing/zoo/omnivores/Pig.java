package com.ing.zoo.omnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Pig extends Animal implements Omnivore, TrickPerformer {
    public Pig(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        say("oink");
    }

    public void eatLeaves()
    {
        say("munch munch oink");
    }

    public void eatMeat()
    {
        say("nomnomnom oink thx");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            say("rolls in the mud");
        }
        else
        {
            say("runs in circles");
        }
    }
}
