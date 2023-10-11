package org.example.tank;

public class MediumTank extends BaseTank {
    private String name;
    //Caliber in millimeters
    private int caliber;
    //light, heavy, medium, artillery or anti-aircraft tank
    public static final String type = "Medium tank";
    private int armourThickness;

    public MediumTank(Tank tank) {
        super(tank);
        this.name = tank.getName();
        this.caliber = tank.getCaliber();
        this.armourThickness = tank.getArmourThickness();
    }
    public MediumTank() {
        super();
    }
    public MediumTank(String name, int caliber, int armourThickness) {
        this.name = name;
        this.caliber = caliber;
        this.armourThickness = armourThickness;
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
    @Override
    public String fire() {
        return super.fire();
    }
    @Override
    public String receiveDamage(int enemyCaliber) {
        return super.receiveDamage(enemyCaliber);
    }

    // Medium tanks are the composition of light and heavy tanks, good mobility, good armour and penetration. So I don't know what is special in them
    public String holdThePosition() {
        return "Hold that position!";
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
