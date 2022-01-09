package pokemon;

import java.util.Scanner;

public class App {
    private static final int NUM_POKEMONS = 5;
    private static Pokemon[] pokemons = new Pokemon[NUM_POKEMONS];
    private static Scanner sc = new Scanner(System.in);

    private static void initPokemons() {
        Pokemon charizard = new Pokemon(100, 50, 50, "charizard");
        pokemons[0] = charizard;
        Pokemon blastoise = new Pokemon(150, 25, 150, "blastoise");
        pokemons[1] = blastoise;
        Pokemon venusaur= new Pokemon(300, 10, 100, "venusaur");
        pokemons[2] = venusaur;
        Pokemon bulbasaur= new Pokemon(250, 20, 180, "bulbasaur");
        pokemons[3] = bulbasaur;
        Pokemon pikachu= new Pokemon(300, 40, 200, "pikachu");
        pokemons[4] = pikachu;
    }
    

    private static void initPokemonsRandomly() {
        for(int i = 0; i < pokemons.length; i++) {
            pokemons[i] = new Pokemon();
            pokemons[i].setName("pokemon" + i);
        }
    }
    
    private static void showPokemons() {
        for(int i = 0; i < pokemons.length; i++) {
            System.out.println(i+1 + ". " + pokemons[i].getName() + "\n");
        }
    }
    
    private static void initCombat() {
        showPokemons();
        System.out.println("Introduce la posicion del primer pokemon: ");
        int primerPokemon = sc.nextInt();
        
        System.out.println("Introduce la posicion del segundo pokemon: ");
        int segundoPokemon = sc.nextInt();
        
        Battle.initBattle(pokemons[primerPokemon - 1], pokemons[segundoPokemon - 1]);
    }
    
}
