// WaterPokemon.java - Subklasse voor Water type
public class WaterPokemon extends Pokemon {
    private final String food = "sweet";
    private final String specialAttack = "hydroPump";

    public WaterPokemon(String name, int level, int xp, int attack, int hp) {
        super(name, "Water", level, xp, attack, hp);
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
            case "Fire": return 25;
            case "Electric": return 15;
            case "Grass": return 10;
            case "Water": return 5;
            default: return 10;
        }
    }

    public void hydroPump(Pokemon enemy) {
        attack(enemy, specialAttack);
    }

    public void rainDance(Pokemon enemy) {
        System.out.println(getName() + " uses rainDance on " + enemy.getName());

        if (enemy.getType().equals("Electric")) {
            System.out.println("has no effect on " + enemy.getName());
            return;
        }

        if (enemy.getType().equals("Grass")) {
            enemy.setHp(enemy.getHp() + 10);
            System.out.println(enemy.getName() + " gains 10 hp from rain");
        }

        int damage = 5;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp remaining");
    }

    public void surf(Pokemon enemy) {
        attack(enemy, "surf");
    }

    public void bubbleBeam(Pokemon enemy) {
        attack(enemy, "bubbleBeam");
    }

    public String getFood() { return food; }
}