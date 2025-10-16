import java.util.List;

// PokemonGym.java - Interface
public interface PokemonGym {
    void enteredTheGym(PokemonTrainer player1);
    void printPokemon(List<Pokemon> pokemons);
    Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);
    Pokemon fight(Pokemon pokemon, Pokemon gymPokemon);
    Pokemon defend(Pokemon pokemon, Pokemon gymPokemon);
    Pokemon normalAttack(Pokemon pokemon, Pokemon gymPokemon);
    Pokemon fireAttack(Pokemon pokemon, Pokemon gymPokemon);
    Pokemon waterAttack(Pokemon pokemon, Pokemon gymPokemon);
    Pokemon grassAttack(Pokemon pokemon, Pokemon gymPokemon);
    Pokemon electricAttack(Pokemon pokemon, Pokemon gymPokemon);
    Pokemon iceAttack(Pokemon pokemon, Pokemon gymPokemon);
}