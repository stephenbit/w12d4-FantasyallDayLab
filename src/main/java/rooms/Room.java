package rooms;

import items.AttackingItem;
import items.treasure.Treasure;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {

    String name;

    protected ArrayList<Treasure> treasureInRoom;
    protected ArrayList<Character> charactersInRoom;

    public Room(
            String name,
            ArrayList<Treasure> treasureInRoom
            ) {
        this.name = name;
        this.treasureInRoom = treasureInRoom;
    }

    public abstract int numberOfTreasureInRoom();

    public abstract void addTreasure(Treasure monsterMunch);
}
