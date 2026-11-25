package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;

public class Lion extends Animal implements Carnivore {
    public Lion(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        say("roooaoaaaaar");
    }

    public void eatMeat()
    {
        say("nomnomnom thx mate");
    }
}
