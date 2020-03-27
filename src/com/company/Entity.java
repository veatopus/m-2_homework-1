package com.company;

public class Entity {

    private boolean alive;
    private String name;
    private Weapons weapons;
    private Color color;

    public Entity(boolean alive, String name, Weapons weapons, Color color) {
        this.alive = alive;
        this.name = name;
        this.weapons = weapons;
        this.color = color;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public String getWeapons() {
        return "Сила удара = " + weapons.getImpactForce() + "\n" +
                "Вес оружия = " + weapons.getWeight();
    }

    public String printInfo() {
        String s;
        String st;
        if (alive) {
            s = " жив";
            st = "зовут его: ";
        } else {
            s = " мёртв";
            st = "звали его: ";
        }
        return
                name + s + "\n" +
                        st + name + "\n" +
                        "об его оружии известно, что \n" +
                        "     сила удара равняется " + weapons.getImpactForce() + "\n" +
                        "     а вес оружия состовляет " + weapons.getWeight() + "\n" +
                        "его цвет - это " + color + "\n";
    }
}
