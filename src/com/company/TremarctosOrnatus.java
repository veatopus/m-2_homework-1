package com.company;

public final class TremarctosOrnatus extends Bear {
    private String topClassification;

    public TremarctosOrnatus(boolean alive, String name, Weapons weapons, Color color, int weight, int length, String topClassification) {
        super(alive, name, weapons, color, weight, length);
        this.topClassification = topClassification;
    }

    public String getTopClassification() {
        return topClassification;
    }

    @Override
    public void makeVoice() {
        super.makeVoice(getName() + " прокречал " + "ROARL!");
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "его высшая класификация - это " + topClassification;
    }

    public void copying(TremarctosOrnatus o){
        topClassification = o.getTopClassification();
    }


}
