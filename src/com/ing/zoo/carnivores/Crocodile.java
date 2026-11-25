package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Crocodile extends Animal implements Carnivore, TrickPerformer {
    public Crocodile(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        say("snap snap");
    }

    public void eatMeat()
    {
        say("chomp chomp gulp");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            say("does a death roll");
        }
        else
        {
            say("lies still like a log");
        }
    }
}
