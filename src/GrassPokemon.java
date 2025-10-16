// GrassPokemon.java - Subklasse voor Grass type
public class GrassPokemon extends Pokemon {
    private final String food = "sour";
    private final String specialAttack = "leafStorm";

    public GrassPokemon(String name, int level, int xp, int attack, int hp) {
        super(name, "Grass", level, xp, attack, hp);
    }

    @Override
    public void attack(Pokemon enemy, String attackType) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with " + attackType);

        int damage = calculateDamage(enemy.getType(), attackType);
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp remaining");
    }

    private int calculateDamage(String enemyType, String attackType) {
        switch (enemyType) {
            case "Electric": return 25;
            case "Fire": return 15;
            case "Water": return 10;
            case "Grass": return 5;
            default: return 10;
        }
    }

    public void leafStorm(Pokemon enemy) {
        attack(enemy, specialAttack);
    }

    public void leechSeed(Pokemon enemy) {
        System.out.println(getName() + " uses leechSeed on " + enemy.getName());

        int damage = 15;
        enemy.setHp(enemy.getHp() - damage);
        this.setHp(this.getHp() + damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(getName() + " gains " + damage + " hp");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp remaining");
        System.out.println(getName() + " has " + this.getHp() + " hp remaining");
    }

    public void solarBeam(Pokemon enemy) {
        attack(enemy, "solarBeam");
    }

    public void vineWhip(Pokemon enemy) {
        attack(enemy, "vineWhip");
    }

    public String getFood() { return food; }
}