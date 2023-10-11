package org.example.tank;

public class HeavyTank extends BaseTank {
    private String name;
    //Caliber in millimeters
    private int caliber;
    //light, heavy, medium, artillery or anti-aircraft tank
    public static final String type = "Heavy tank";
    private int armourThickness;

    public HeavyTank(Tank tank) {
        super(tank);
        this.name = tank.getName();
        this.caliber = tank.getCaliber();
        this.armourThickness = tank.getArmourThickness();
    }
    public HeavyTank() {
        super();
    }
    public HeavyTank(String name, int caliber, int armourThickness) {
        this.name = name;
        this.caliber = caliber;
        this.armourThickness = armourThickness;
    }

    @Override
    public String fire() {
        return super.fire();
    }
    @Override
    public String receiveDamage(int enemyCaliber) {
        return super.receiveDamage(enemyCaliber);
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    //Heavy tanks have good armour, so they used for breakout lines
    public String lineBreakout() {
        return "Breakout that line!";
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
