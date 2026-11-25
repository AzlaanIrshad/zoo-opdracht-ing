package com.ing.zoo;

import com.ing.zoo.carnivores.*;
import com.ing.zoo.herbivores.*;
import com.ing.zoo.omnivores.*;

import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Monkey punch = new Monkey("punch");
        Crocodile crok = new Crocodile("crok");

        List<Animal> animals = Arrays.asList(henk, elsa, dora, wally, marty, punch, crok);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().trim().toLowerCase();
        if(input.equals(commands[0]) || input.startsWith(commands[0] + " "))
        {
            String name = input.substring(commands[0].length()).trim();
            boolean found = false;
            for(Animal animal : animals)
            {
                if(name.isEmpty() || animal.getName().equalsIgnoreCase(name))
                {
                    animal.sayHello();
                    found = true;
                }
            }
            if(!found)
            {
                System.out.println("Unknown animal: " + name);
            }
        }
        else if(input.equals(commands[1]))
        {
            for(Animal animal : animals)
            {
                if(animal instanceof Herbivore)
                {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        else if(input.equals(commands[2]))
        {
            for(Animal animal : animals)
            {
                if(animal instanceof Carnivore)
                {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        else if(input.equals(commands[3]))
        {
            for(Animal animal : animals)
            {
                if(animal instanceof TrickPerformer)
                {
                    ((TrickPerformer) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
