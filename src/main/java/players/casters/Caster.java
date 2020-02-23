package players.casters;

import items.AttackingItem;
import items.mythicalcreatures.MythicalCreature;
import players.Character;

import java.util.ArrayList;

public abstract class Caster extends Character {

    protected MythicalCreature mythicalCreature;

    public Caster(
            String name,
            double healthPoints,
            double attackRating,
            double defenceRating,
            ArrayList<AttackingItem> attackingItemBag,
            AttackingItem heldAttackingItem,
            MythicalCreature mythicalCreature
    ) {
        super(
                name,
                healthPoints,
                attackRating,
                defenceRating,
                attackingItemBag,
                heldAttackingItem
        );
        this.mythicalCreature = mythicalCreature;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
        this.defenceRating *= mythicalCreature.getDefenceMultiplier();
    }
}
