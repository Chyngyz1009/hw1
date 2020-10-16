package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("x", "pit", new String[]{"jds", "ks"}, Color.black, new Shelter("Hdj", "jajd"));
        Dog dog3 = new Dog(Color.white, new Shelter("hdsh", "dks"), "jsk", "dslds");
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());
        System.out.println(dog3.getInfo());
        dog1.makeVoice("gaf,gaf,gaf");
        dog2.makeVoice("gaf",2);
        dog3.makeVoice(2,"gaf");



    }   
}


