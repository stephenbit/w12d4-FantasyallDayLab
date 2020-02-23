package items;

public abstract class AttackingItem {

    protected String name;
    protected double attackMultiplier;

    public AttackingItem(String name, double attackMultiplier) {
        this.name = name;
        this.attackMultiplier = attackMultiplier;
    }

    public double getAttackMultiplier() {
        return attackMultiplier;
    }
}
