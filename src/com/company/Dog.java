package com.company;

public class Dog extends Pet {

    private String name;

    private String breed;

    private String[] commands;

    public Dog() {
    }

    public Dog(String name, String breed, String[] commands, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(Color color, Shelter shelter, String name, String breed) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeVoice(String voice, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);

        }


    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);

        }
    }

    public void makeVoice(String voice) {
        System.out.println(voice);

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nname= " + name +
                "\nbreed=" + breed +
                "\ncommands=" + commands;
    }
}




