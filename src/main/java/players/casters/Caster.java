package players.casters;

import items.mythicalcreatures.MythicalCreature;
import players.Player;

public abstract class Caster extends Player {

    protected MythicalCreature mythicalCreature;

    public Caster(int healthPoints, String name, int attackRating, int defenceRating) {
        super(healthPoints, name, attackRating, defenceRating);
        this.mythicalCreature = null;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
        this.defenceRating *= mythicalCreature.getDefenceMultiplier();
    }
}
