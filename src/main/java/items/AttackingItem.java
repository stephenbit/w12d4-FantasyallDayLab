package items;

public abstract class AttackingItem {

    protected String name;
    protected int attackMultiplier;

    public AttackingItem(String name, int attackMultiplier) {
        this.name = name;
        this.attackMultiplier = attackMultiplier;
    }

    public int getAttackMultiplier() {
        return attackMultiplier;
    }
}
