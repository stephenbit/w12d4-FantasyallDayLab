import items.AttackingItem;
import items.treasure.Treasure;
import org.junit.Before;
import org.junit.Test;
import characters.Character;
import characters.fighters.Knight;
import rooms.RoomDungeon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    RoomDungeon dungeonRoom;
    Character knight;
    AttackingItem unarmed;
    Treasure monsterMunch;
    ArrayList<AttackingItem> attackingItemBag;
    ArrayList<Character> charactersInRoom;
    ArrayList<Treasure> treasureInRoom;

    @Before
    public void before() {

        treasureInRoom = new ArrayList<Treasure>();
        dungeonRoom = new RoomDungeon(
                "dungeon",
                treasureInRoom
        );
        knight = new Knight(
                "Stephen",
                20,
                3,
                1,
                attackingItemBag,
                unarmed
        );
    }

    @Test
    public void roomStartsWithoutTreasure() {
        assertEquals(0, dungeonRoom.numberOfTreasureInRoom());
    }

    @Test
    public void canAddTreasureToRoom() {
        dungeonRoom.addTreasure(monsterMunch);
        assertEquals(1, dungeonRoom.numberOfTreasureInRoom());
    }
}
