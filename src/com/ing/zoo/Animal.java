package com.ing.zoo;

public abstract class Animal {
    private final String name;

    protected Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract void sayHello();

    protected void say(String text)
    {
        System.out.println(name + ": " + text);
    }
}
