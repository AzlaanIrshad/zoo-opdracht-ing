package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;

public class Lion extends Animal implements Carnivore {
    public String eatText;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        say(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        say(eatText);
    }
}
