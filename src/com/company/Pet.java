package com.company;

public class Pet {

    private int age = generatedDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }
    public Pet(){}
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int getAge() {

        return age;
    }

    private int generatedDefaultAge() {
     /*Random random= new Random();;
     return random.next(15) ;
      */
        return (int) Math.random() * 10 + 5;
    }

    public String getInfo() {
        return "Pet = {" +
                " \nage = " + age +
                "\ncolor=" + color +
                "\nShelter=" + shelter +
                "\n}";


    }
}
