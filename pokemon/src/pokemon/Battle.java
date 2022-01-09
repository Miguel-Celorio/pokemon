package pokemon;

public class Battle {
	public static void initBattle(Pokemon pokemon1, Pokemon pokemon2) {
		
		Pokemon primerPokemon = pokemon1;
		Pokemon segundoPokemon = pokemon2;

		while(pokemon1.getHealth() > 0 && pokemon2.getHealth() > 0) {
			pokemon2.setHealth(pokemon2.getHealth() -pokemon1.getStrength());
			pokemon1.setHealth(pokemon1.getHealth() -pokemon2.getStrength());
			
			if(pokemon1.getSpeed() > pokemon2.getSpeed()) {
				primerPokemon = pokemon1;
				segundoPokemon = pokemon2;
			} else {
				primerPokemon = pokemon2;
				segundoPokemon = pokemon1;
			}
			
			System.out.println(primerPokemon.getName() + " comienza el ataque contra " + segundoPokemon.getName());
			
			System.out.println(primerPokemon.getName() + " daña " + primerPokemon.getStrength() + " a " + 
			segundoPokemon.getName() + " y a " + segundoPokemon.getName() + " le queda " + 
			segundoPokemon.getHealth() + " vida.");
			System.out.println(segundoPokemon.getName() + " daña " + segundoPokemon.getStrength() + " a " + 
					primerPokemon.getName() + " y a " + primerPokemon.getName() + " le queda " + 
					primerPokemon.getHealth() + " vida.");
			
		}
		
		System.out.println("-------------------------------------------");
		
		if(pokemon1.getHealth() <= 0 && pokemon2.getHealth() <= 0) {
			System.out.println("Los dos pokemon se han debilitado");
		} else if(pokemon1.getHealth() <= 0) {
			System.out.println(pokemon1.getName() + " ha perdido el combate");
		} else {
			System.out.println(pokemon2.getName() + " ha perdido el combate");
		}
		
		
	}
}
