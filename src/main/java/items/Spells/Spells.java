package items.Spells;

import items.AttackingItem;

public abstract class Spells extends AttackingItem {

    double specialAbility;

    public Spells(String name, double attackMultiplier, double specialAbility) {
        super(name, attackMultiplier);
        this.specialAbility = specialAbility;
    }
}
