package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;
import com.ing.zoo.TrickPerformer;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, TrickPerformer {
    public String eatText;
    public String trick;

    public Tiger()
    {
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        say(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom rawr wubalubadubdub";
        say(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        say(trick);
    }
}
