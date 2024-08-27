package edii_polimorfismo;
import java.util.Random;

public class Main {
	  public static void main(String[] args) {
		  
		  // variaveis para criação dos pokemons
		  Random aleatorio = new Random();
		  String[] randName = {"Agumon", "Gabumon", "Piyomon", "Tentomon", "Palmon"};
		  
		  for (int i = 0; i < 3; i++) {
		  int randNameSelector = aleatorio.nextInt(randName.length);
		  int randLevel = aleatorio.nextInt(11);
		  int 
		  }
		  
		  Pokemon agumon = new PokemonFogo("Agumon", 10, 100);
		  Pokemon gurumon = new PokemonAgua("Gurumon", 10, 100);
		  
		  
		  
		  
		  
	  }
	

}
