package characters;

import items.AttackingItem;
import items.weapons.Unarmed;

import java.util.ArrayList;

public abstract class Character implements Attacking {

    protected String name;
    protected double healthPoints;
    protected double attackRating;
    protected double defenceRating;
    protected ArrayList<AttackingItem> attackingItemBag;
    protected AttackingItem heldAttackingItem;

    public Character(
            String name,
            double healthPoints,
            double attackRating,
            double defenceRating,
            ArrayList<AttackingItem> attackingItemBag,
            AttackingItem heldAttackingItem
    ) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackRating = attackRating;
        this.defenceRating = defenceRating;
        this.attackingItemBag = attackingItemBag;
        this.heldAttackingItem = new Unarmed("unarmed", 1);
    }

    public AttackingItem getHeldAttackingItem() {
        return heldAttackingItem;
    }

    public double getDefenceRating() {
        return defenceRating;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void selectAttackingItem(AttackingItem heldAttackingItem) {
        this.heldAttackingItem = heldAttackingItem;
    }

    public double calculateTotalAttackValue() {
        return this.heldAttackingItem.getAttackMultiplier() * this.attackRating;
    }

    public void attack(Character opposingCharacter) {
        double effectiveDamage = calculateTotalAttackValue() - opposingCharacter.defenceRating;
        if(effectiveDamage > 0) {
            opposingCharacter.healthPoints -= effectiveDamage;
        }
        opposingCharacter.defenceRating --;
    }



}
