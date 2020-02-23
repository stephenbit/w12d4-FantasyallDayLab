package rooms;

import items.treasure.Treasure;

public abstract class Room {

    String name;

    private Character character;
    private Treasure treasure;


    public Room(String name) {
        this.name = name;
        this.character = character;
        this.treasure = null;
    }
}
