package players;

import items.AttackingItem;
import items.weapons.Unarmed;

public abstract class Player implements Attacking {

    protected int healthPoints;
    protected String name;
    protected int attackRating;
    protected int defenceRating;
    protected AttackingItem heldAttackingItem;

    public Player(int healthPoints, String name, int attackRating, int defenceRating) {
        this.healthPoints = healthPoints;
        this.name = name;
        this.attackRating = attackRating;
        this.defenceRating = defenceRating;
        this.heldAttackingItem = new Unarmed("unarmed", 1);
    }

    public AttackingItem getHeldAttackingItem() {
        return heldAttackingItem;
    }

    public int getDefenceRating() {
        return defenceRating;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void selectAttackingItem(AttackingItem heldAttackingItem) {
        this.heldAttackingItem = heldAttackingItem;
    }

    public int calculateTotalAttackValue() {
        return this.heldAttackingItem.getAttackMultiplier() * this.attackRating;
    }

    public void attack(Player opposingPlayer) {
        int effectiveDamage = calculateTotalAttackValue() - opposingPlayer.defenceRating;
        if(effectiveDamage > 0) {
            opposingPlayer.healthPoints -= effectiveDamage;
        }
        opposingPlayer.defenceRating --;
    }



}
