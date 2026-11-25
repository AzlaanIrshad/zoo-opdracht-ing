package com.ing.zoo.herbivores;

import com.ing.zoo.Animal;

public class Hippo extends Animal implements Herbivore {
    public String eatText;

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        say(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        say(eatText);
    }
}
