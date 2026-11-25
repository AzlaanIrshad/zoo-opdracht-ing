package com.ing.zoo.herbivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;
import java.util.Random;

public class Zebra extends Animal implements Herbivore, TrickPerformer {
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        say(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        say(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "does a front flip";
        }
        else
        {
            trick = "does a back flip";
        }
        say(trick);
    }
}
