package rooms;

import items.treasure.Treasure;

import java.util.ArrayList;

public class RoomDungeon extends Room {


    public RoomDungeon(String name, ArrayList<Treasure> treasureInRoom) {
        super(name, treasureInRoom);
    }

    public int numberOfTreasureInRoom() {
        return treasureInRoom.size();
    }

    public void addTreasure(Treasure treasure) {
        treasureInRoom.add(treasure);
    }


}
