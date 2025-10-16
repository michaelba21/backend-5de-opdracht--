// ElectricPokemon.java - Subklasse voor Electric type
public class ElectricPokemon extends Pokemon {
    private final String food = "bitter";
    private final String specialAttack = "thunder";

    public ElectricPokemon(String name, int level, int xp, int attack, int hp) {
        super(name, "Electric", level, xp, attack, hp);
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
            case "Water": return 25;
            case "Grass": return 15;
            case "Fire": return 10;
            case "Electric": return 5;
            default: return 10;
        }
    }

    public void thunder(Pokemon enemy) {
        System.out.println(getName() + " uses thunder on " + enemy.getName());

        if (enemy.getType().equals("Electric")) {
            enemy.setHp(enemy.getHp() + 10);
            System.out.println(enemy.getName() + " gains 10 hp from thunder");
        }

        int damage = calculateDamage(enemy.getType(), "thunder");
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp remaining");
    }

    public void thunderBolt(Pokemon enemy) {
        attack(enemy, "thunderBolt");
    }

    public void electroBall(Pokemon enemy) {
        attack(enemy, "electroBall");
    }

    public void shockWave(Pokemon enemy) {
        attack(enemy, "shockWave");
    }

    public String getFood() { return food; }
}