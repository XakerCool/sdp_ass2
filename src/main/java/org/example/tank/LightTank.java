package org.example.tank;

public class LightTank extends BaseTank {
    private String name;
    //Caliber in millimeters
    private int caliber;
    //light, heavy, medium, artillery or anti-aircraft tank
    public static final String type = "Light tank";
    private int armourThickness;

    public LightTank(Tank tank) {
        super(tank);
        this.name = tank.getName();
        this.caliber = tank.getCaliber();
        this.armourThickness = tank.getArmourThickness();
    }
    public LightTank() {
        super();
    }
    public LightTank(String name, int caliber, int armourThickness) {
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

    //Light tanks are usually used for scout the targets
    public String scoutTarget() {
        return "Target scouted!";
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
