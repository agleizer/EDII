package edii_polimorfismo;
import java.util.Random;

public class Main {
	  public static void main(String[] args) {
		  
		  // variaveis para criação dos pokemons
		  Pokemon pokeUm, pokeDois;
		  Random aleatorio = new Random();
		  String[] randName = {"Agumon", "Gabumon", "Piyomon", "Tentomon", "Palmon"};
		  
		  int randTipo1 = 1 + aleatorio.nextInt(3);
		  int randTipo2 = 1 + aleatorio.nextInt(3);

		  // criacao pokemons
		  switch (randTipo1) {
			case 1:
				pokeUm = new PokemonAgua(randName[aleatorio.nextInt(randName.length)-1], "agua", 1 + aleatorio.nextInt(9), 50 + aleatorio.nextInt(50));
				break;
			case 2:
				pokeUm = new PokemonFogo(randName[aleatorio.nextInt(randName.length)-1], "fogo", 1 + aleatorio.nextInt(9), 50 + aleatorio.nextInt(50));
				break;
			case 3:
				pokeUm = new PokemonPlanta(randName[aleatorio.nextInt(randName.length)-1], "planta", 1 + aleatorio.nextInt(9), 50 + aleatorio.nextInt(50));
				break;
		  }

		  switch (randTipo2) {
			case 1:
				pokeDois = new PokemonAgua(randName[aleatorio.nextInt(randName.length)-1], "agua", 1 + aleatorio.nextInt(9), 50 + aleatorio.nextInt(50));
				break;
			case 2:
				pokeDois = new PokemonFogo(randName[aleatorio.nextInt(randName.length)-1], "fogo", 1 + aleatorio.nextInt(9), 50 + aleatorio.nextInt(50));
				break;
			case 3:
				pokeDois = new PokemonPlanta(randName[aleatorio.nextInt(randName.length)-1], "planta" 1 + aleatorio.nextInt(9), 50 + aleatorio.nextInt(50));
				break;
		  }

		  // inicio jogo
		  System.out.println("Um novo dia começa na jornada de %s!", System.getProperty("user.name"));
		  System.out.println("Pokemon 1: " + pokeUm.getNome + ", tipo " + pokeUm.getTipo() + ", nível " + pokeUm.getNivel + ", HP: " + pokeUm.getHp);
		  System.out.println("Pokemon 2: " + pokeDois.getNome + ", tipo " + pokeDois.getTipo() + ", nível " + pokeDois.getNivel + ", HP: " + pokeDois.getHp);
		  System.out.println("Essa batalha está apenas começando!");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");

		  



		  //while (pokeUm.estaVivo() && pokeDois.estaVivo()) {

		  //}
		  
		  
		  
		  
	  }
	

}
