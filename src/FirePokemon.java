// FirePokemon.java - Subklasse voor Fire type
public class FirePokemon extends Pokemon {
    private final String food = "spicy";
    private final String specialAttack = "fireBlast";

    public FirePokemon(String name, int level, int xp, int attack, int hp) {
        super(name, "Fire", level, xp, attack, hp);
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
            case "Grass": return 25;
            case "Water": return 15;
            case "Electric": return 10;
            case "Fire": return 5;
            default: return 10;
        }
    }

    public void fireBlast(Pokemon enemy) {
        attack(enemy, specialAttack);
    }

    public void inferno(Pokemon enemy) {
        attack(enemy, "inferno");
    }

    public void flameThrower(Pokemon enemy) {
        attack(enemy, "flameThrower");
    }

    public void ember(Pokemon enemy) {
        attack(enemy, "ember");
    }

    public String getFood() { return food; }
}