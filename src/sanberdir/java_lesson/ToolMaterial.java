package sanberdir.java_lesson;

public enum ToolMaterial {
    WOOD("wood", 2,1.5F),
    IRON("iron", 4,3.58F),
    STONE("stone",1, 0.7F);

    private String displayName;
    private int durability;
    private float miningSpeed;

    ToolMaterial(String name, int durability, float miningSpeed) {
        this.displayName = name;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getDurability() {
        return durability;
    }

    public float getMiningSpeed() {
        return miningSpeed;
    }
}
