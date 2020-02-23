package items.mythicalcreatures;

public abstract class MythicalCreature {

    protected String name;
    protected double defenceMultiplier;

    public MythicalCreature(String name, double defenceMultiplier) {
        this.name = name;
        this.defenceMultiplier = defenceMultiplier;
    }

    public double getDefenceMultiplier() {
        return defenceMultiplier;
    }


}
