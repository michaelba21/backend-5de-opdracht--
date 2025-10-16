// Main.java - Hoofdklasse
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pokémon aanmaken - elk met specifiek type en stats
        List<Pokemon> playerPokemons = new ArrayList<>();
        playerPokemons.add(new FirePokemon("Charizard", 50, 1000, 120, 180));
        playerPokemons.add(new WaterPokemon("Blastoise", 50, 1000, 110, 200));
        playerPokemons.add(new GrassPokemon("Venusaur", 50, 1000, 115, 190));
        playerPokemons.add(new ElectricPokemon("Pikachu", 50, 1000, 125, 150));

        // Trainer aanmaken met de Pokémon team
        PokemonTrainer player = new PokemonTrainer("Ash", playerPokemons);

        // Gym leader Pokémon - sterker dan player Pokémon
        List<Pokemon> gymPokemons = new ArrayList<>();
        gymPokemons.add(new FirePokemon("Arcanine", 55, 1200, 130, 170));
        gymPokemons.add(new WaterPokemon("Gyarados", 55, 1200, 125, 185));

        GymLeader gymLeader = new GymLeader("Brock", gymPokemons, "Rock");

        //Gym implementatie starten - hier begint het eigenlijke spel
        PokemonGym gym = new PokemonGymImpl();
        gym.enteredTheGym(player);

        scanner.close();
    }
}