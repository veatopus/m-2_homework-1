package com.company;

public class Main {

    public static void main(String[] args) {
        Weapons weapons = new Weapons(15, 5);
        Bear bear = new Bear(true, "Боря", weapons, Color.BROWN, 60, 200);
        Weapons weapons1 = new Weapons(20, 10);
        TremarctosOrnatus spectacledBear = new TremarctosOrnatus(true, "Черныш", weapons1, Color.BLACK, 110, 180, "spectacled bear");
        TremarctosOrnatus spectacledBear1 = new TremarctosOrnatus(false, "Мертвый Черныш", weapons1, Color.BLACK, 110, 180, "bear");
        System.out.println("информация об " + bear.getName()+ ":\n" + bear.printInfo());
        System.out.println("________________________");
        System.out.println("информация об " + spectacledBear.getName()+ ":\n" + spectacledBear.printInfo());
        System.out.println("________________________");
        System.out.println("информация об " + spectacledBear1.getName()+ ":\n" + spectacledBear1.printInfo());
        System.out.println("________________________");

        bear.makeVoice();
        System.out.println("________________________");
        bear.makeVoice("не ори на меня");
        System.out.println("________________________");
        spectacledBear.makeVoice();
        System.out.println("________________________");
        spectacledBear1.makeVoice();
        System.out.println("________________________");

        spectacledBear1.copying(spectacledBear);
        System.out.println(spectacledBear1.printInfo()); 
        System.out.println("________________________");

    }
}
