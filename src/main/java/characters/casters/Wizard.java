package characters.casters;

import items.AttackingItem;
import items.mythicalcreatures.MythicalCreature;

import java.util.ArrayList;

public class Wizard extends Caster {

    public Wizard(
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
                heldAttackingItem,
                mythicalCreature
        );
    }
}
