// Pokemon.java - Abstract super klasse in Pokemon
public abstract class Pokemon {
    private final String name;
    private final String type;
    private final int level;
    private final int xp;
    private final int attack;
    private int hp;

    public Pokemon(String name, String type, int level, int xp, int attack, int hp) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.xp = xp;
        this.attack = attack;
        this.hp = hp;
    }

    // Getters
    public String getName() { return name; }
    public String getType() { return type; }
    public int getLevel() { return level; }
    public int getXp() { return xp; }
    public int getAttack() { return attack; }
    public int getHp() { return hp; }

    // Setter voor HP
    public void setHp(int hp) { this.hp = hp; }

    // Abstracte methode voor aanval
    public abstract void attack(Pokemon enemy, String attackType);
}