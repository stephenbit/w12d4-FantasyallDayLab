import items.AttackingItem;
import items.Spells.Fireball;
import items.mythicalcreatures.Dragon;
import items.mythicalcreatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;
import players.Attacking;
import players.Player;
import players.casters.Caster;
import players.casters.Warlock;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Player warlock;
    Player knight;
    AttackingItem fireball;
    MythicalCreature dragon;

    @Before
    public void before() {
        warlock = new Warlock(100, "Alex", 2, 4);
        knight = new Knight(150, "Stephen", 3, 4);
        fireball = new Fireball("Fireball", 6);
        dragon = new Dragon("Harrison", 2);
    }

    @Test
    public void canAttack() {
        warlock.attack(knight);
        assertEquals(148, knight.getHealthPoints());
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
        assertEquals(8, warlock.getDefenceRating());
    }

}
