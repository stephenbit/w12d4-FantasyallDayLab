package characters.fighters;

import items.AttackingItem;
import characters.Character;

import java.util.ArrayList;

public class Barbarian extends Character {

    public Barbarian(
            String name,
            double healthPoints,
            double attackRating,
            double defenceRating,
            ArrayList<AttackingItem> attackingItemBag,
            AttackingItem heldAttackingItem
    ) {
        super(
                name,
                healthPoints,
                attackRating,
                defenceRating,
                attackingItemBag,
                heldAttackingItem
        );
    }
}
