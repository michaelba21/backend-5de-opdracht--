import java.util.List;

// GymLeader.java - Extends PokemonTrainer
public class GymLeader extends PokemonTrainer {
    private String gymType;

    public GymLeader(String name, List<Pokemon> pokemons, String gymType) {
        super(name, pokemons);
        this.gymType = gymType;
    }

    public String getGymType() { return gymType; }
    public void setGymType(String gymType) { this.gymType = gymType; }
}