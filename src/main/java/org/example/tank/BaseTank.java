package org.example.tank;

public class BaseTank implements Tank {
    private String name;
    //Caliber in millimeters
    private int caliber;
    //light, heavy, medium, artillery or anti-aircraft tank
    private String type;
    //Same tank type can have different armour thickness
    private int armourThickness;

    public BaseTank(Tank tank) {
        this.name = tank.getName();
        this.type = tank.getType();
        this.caliber = tank.getCaliber();
        this.armourThickness = tank.getArmourThickness();
    }
    public BaseTank() {
        this.name = "";
        this.caliber = 0;
        this.type = "";
        this.armourThickness = 0;
    }
    public BaseTank(String name, int caliber, int armourThickness, String type) {
        this.name = name;
        this.caliber = caliber;
        this.armourThickness = armourThickness;
        this.type = type;
    }

    @Override
    public String fire() {
        return "Shoot in a straight line with " + this.caliber + " caliber!";
    }
    @Override
    public String receiveDamage(int enemyCaliber) {
        if (this.armourThickness < enemyCaliber) {
            return  "Tank with " + this.armourThickness + "mm armour destroyed with " + enemyCaliber + "mm caliber shot!";
        }
        else if (this.armourThickness > enemyCaliber){
            return  "Tank with " + this.armourThickness + "mm armour survived with " + enemyCaliber + "mm caliber shot!";
        }
        else {
            return  "Tank with " + this.armourThickness + "mm armour gor critical damage with " + enemyCaliber + "mm caliber shot!";
        }
    }
    @Override
    public String getDescription() {
        return "Tank name: " + this.getName() + ", tank type: " + this.getType() + ", caliber " + this.getCaliber() + ", armour thickness " + this.getArmourThickness();
    }

    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public int getCaliber() {
        return this.caliber;
    }
    public int getArmourThickness() {
        return this.armourThickness;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }
    public void setArmourThickness(int armourThickness) {
        this.armourThickness = armourThickness;
    }
}
