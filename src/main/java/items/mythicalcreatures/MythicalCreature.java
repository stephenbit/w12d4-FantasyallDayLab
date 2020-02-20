package items.mythicalcreatures;

public abstract class MythicalCreature {

    protected String name;
    protected int defenceMultiplier;

    public MythicalCreature(String name, int defenceMultiplier) {
        this.name = name;
        this.defenceMultiplier = defenceMultiplier;
    }

    public int getDefenceMultiplier() {
        return defenceMultiplier;
    }
}
