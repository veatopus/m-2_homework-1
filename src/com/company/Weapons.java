package com.company;

public class Weapons {
    private int impactForce;
    private int weight;

    public Weapons(int impactForce, int weight) {
        this.impactForce = impactForce;
        this.weight = weight;
    }

    public int getImpactForce() {
        return impactForce;
    }

    public int getWeight() {
        return weight;
    }
}
