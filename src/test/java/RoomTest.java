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
    ArrayList<AttackingItem> attackingItemBag;
    ArrayList<Character> charactersInRoom;
    ArrayList<Treasure> treasureInRoom;

    @Before
    public void before() {
        dungeonRoom = new RoomDungeon(
                "dungeon",
                charactersInRoom,
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

//    @Test
//    public void roomStartsWithZeroCharacters() {
//        assertEquals(0, );
//    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, dungeonRoom.numberOfObjectsInRoom());
    }

    @Test
    public void canAddCharacterToRoom() {
        dungeonRoom.addCharacter(knight);
        assertEquals(1, dungeonRoom.numberOfObjectsInRoom());
    }
}
