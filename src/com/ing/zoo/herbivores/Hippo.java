package com.ing.zoo.herbivores;

import com.ing.zoo.Animal;

public class Hippo extends Animal implements Herbivore {
    public Hippo(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        say("splash");
    }

    public void eatLeaves()
    {
        say("munch munch lovely");
    }
}
