package rooms;

import items.treasure.Treasure;

import java.util.ArrayList;

public class RoomDungeon extends Room {

    public RoomDungeon(
            String name,
            ArrayList<Character> charactersInRoom,
            ArrayList<Treasure> treasureInRoom
    ) {
        super(name, charactersInRoom, treasureInRoom);
    }
}
