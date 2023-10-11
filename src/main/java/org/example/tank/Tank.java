package org.example.tank;

public interface Tank {
    //Some tanks have different shooting style
    String fire();
    //Tanks have different armor thickness, so received damage is also different
    String receiveDamage(int enemyCaliber);

    String getDescription();
    String getName();
    String getType();
    int getCaliber();
    int getArmourThickness();
}
