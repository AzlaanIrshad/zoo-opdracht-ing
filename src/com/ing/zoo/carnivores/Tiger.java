package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, TrickPerformer {
    public Tiger(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        say("rraaarww");
    }

    public void eatMeat()
    {
        say("nomnomnom rawr wubalubadubdub");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            say("jumps in tree");
        }
        else
        {
            say("scratches ears");
        }
    }
}
