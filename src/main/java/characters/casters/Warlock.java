package characters.casters;

import items.AttackingItem;
import items.mythicalcreatures.MythicalCreature;
import characters.Character;

import java.util.ArrayList;

public class Warlock extends Caster {

    public Warlock(
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

    public void attack(Character opposingCharacter) {
        super.attack(opposingCharacter);
    }



}
