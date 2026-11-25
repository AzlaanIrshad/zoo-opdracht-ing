package com.ing.zoo.herbivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;
import java.util.Random;

public class Zebra extends Animal implements Herbivore, TrickPerformer {
    public Zebra(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        say("zebra zebra");
    }

    public void eatLeaves()
    {
        say("munch munch zank yee bra");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            say("does a front flip");
        }
        else
        {
            say("does a back flip");
        }
    }
}
