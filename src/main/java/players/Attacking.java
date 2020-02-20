package players;

import players.Player;

public interface Attacking {

    int calculateTotalAttackValue();
    void attack(Player opposingPlayer);

}
