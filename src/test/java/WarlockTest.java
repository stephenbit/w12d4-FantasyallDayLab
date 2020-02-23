import items.AttackingItem;
import items.Spells.Fireball;
import items.mythicalcreatures.Dragon;
import items.mythicalcreatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;
import players.Character;
import players.casters.Caster;
import players.casters.Warlock;
import players.fighters.Dwarf;
import players.fighters.Knight;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Character warlock;
    Character knight;
    AttackingItem fireball;
    AttackingItem unarmed;
    MythicalCreature dragon;
    ArrayList<AttackingItem> attackingItemBag;


    @Before
    public void before() {
//        attackingItemBag = new ArrayList<AttackingItem>();
        warlock = new Warlock(
                "Frankenthingy",
                10,
                2,
                4,
                attackingItemBag,
                unarmed,
                dragon
        );
        knight = new Knight(
                "Stephen",
                20,
                3,
                1,
                attackingItemBag,
                unarmed
        );
        fireball = new Fireball("Fireball", 6, 8);
        dragon = new Dragon("Luca", 2);
    }

    @Test
    public void canInflictHealthDamage() {
        warlock.attack(knight);
        assertEquals(19, knight.getHealthPoints(),0.01);
    }

    @Test
    public void canSelectAttackingItem(){
        warlock.selectAttackingItem(fireball);
        assertEquals(fireball, warlock.getHeldAttackingItem());
    }

    @Test
    public void canSetMythicalCreature(){
        ((Caster) warlock).setMythicalCreature(dragon);
        assertEquals(dragon, ((Caster)warlock).getMythicalCreature());
    }

    @Test
    public void defenceRatingIncreasesWhenMythicalCreatureSet(){
        ((Caster) warlock).setMythicalCreature(dragon);
        assertEquals(8, warlock.getDefenceRating(), 0.01);
    }

    @Test
    public void canReduceDefenseIfOpponentsDefenceRatingIsMoreThanAttackersAttack() {
        Character dwarf = new Dwarf(
                "Kirkwood",
                11,
                2,
                3,
                attackingItemBag,
                unarmed
        );
         warlock.attack(dwarf);
         assertEquals(2, dwarf.getDefenceRating(), 0.01);
         assertEquals(11, dwarf.getHealthPoints(), 0.01);
    }

}
