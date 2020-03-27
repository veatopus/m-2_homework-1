package com.company;

public class Bear extends Entity {
    private int weight;
    private int length;

    public Bear(boolean alive, String name, Weapons weapons, Color color, int weight, int length) {
        super(alive, name, weapons, color);
        this.weight = weight;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void makeVoice(){
        System.out.println("roar!");
    }

    public final void makeVoice(String voice){
        System.out.println(voice);
    }
    @Override
    public String printInfo () {
        return super.printInfo() + "весит он " + weight + "\nдлина его состовляет " + length + "\n";
    }
}
