import java.util.Random;

public class Main {
	  public static void main(String[] args) {
		  
		  // variaveis para criação dos pokemons
		  Pokemon pokeUm = null;
		  Pokemon pokeDois = null;
		  Random aleatorio = new Random();
		  String[] randName = {"Agumon", "Gabumon", "Piyomon", "Tentomon", "Palmon", "Biyomon", "Kuwagamon", "Digmon", "Gomamon", "Patamon", "Tamagotchi", "Koromon", "Kumamon", "Monodramon", "Gabumon", "Wormmon", "Gatomon", "Veemon", "Armadillomon", "Lalamon", "DemiDevimon", "Elecmon", "Hawkmon", "Lobomon", "Bergemon", "Codymon", "Mushroomon", "Ophanimon", "Golemon", "Lillymon", "Angewomon", "V-mon", "Shamanmon", "Mammothmon", "Bakuramon", "Grapleomon", "Pukamon", "Bmon", "Pteramon", "Dracomon"};
		  
		  int randTipo1 = 1 + aleatorio.nextInt(3);
		  int randTipo2 = 1 + aleatorio.nextInt(3);

		  int nivel1 = 1 + aleatorio.nextInt(9);
		  int nivel2 = 1 + aleatorio.nextInt(9);

		  // criacao pokemons
		  switch (randTipo1) {
			case 1:
				pokeUm = new PokemonAgua(randName[aleatorio.nextInt(randName.length-1)], "agua", nivel1, (10*nivel1) + aleatorio.nextInt(50));
				break;
			case 2:
				pokeUm = new PokemonFogo(randName[aleatorio.nextInt(randName.length-1)], "fogo", nivel1, (10*nivel1) + aleatorio.nextInt(50));
				break;
			case 3:
				pokeUm = new PokemonPlanta(randName[aleatorio.nextInt(randName.length-1)], "planta", nivel1, (10*nivel1) + aleatorio.nextInt(50));
				break;
		  }

		  switch (randTipo2) {
			case 1:
				pokeDois = new PokemonAgua(randName[aleatorio.nextInt(randName.length-1)], "agua", nivel2, (10*nivel2) + aleatorio.nextInt(50));
				break;
			case 2:
				pokeDois = new PokemonFogo(randName[aleatorio.nextInt(randName.length - 1)], "fogo", nivel2, (10*nivel2) + aleatorio.nextInt(50));
				break;
			case 3:
				pokeDois = new PokemonPlanta(randName[aleatorio.nextInt(randName.length-1)], "planta", nivel2, (10*nivel2) + aleatorio.nextInt(50));
				break;
		  }

		  // inicio jogo
		  System.out.println("Um novo dia começa na jornada de " + System.getProperty("user.name"));
		  System.out.println("Pokemon 1: " + pokeUm.getNome() + ", tipo " + pokeUm.getTipo() + ", nível " + pokeUm.getNivel() + ", HP: " + pokeUm.getHp());
		  System.out.println("Pokemon 2: " + pokeDois.getNome() + ", tipo " + pokeDois.getTipo() + ", nível " + pokeDois.getNivel() + ", HP: " + pokeDois.getHp());
		  System.out.println("Essa batalha está apenas começando!");
		  System.out.println("");

		  while (pokeUm.estaVivo() && pokeDois.estaVivo()) {
			pokeUm.atacar(pokeDois);
			System.out.println(pokeUm.getNome() + " ataca " + pokeDois.getNome());
			System.out.println(pokeDois.getNome() + " está com hp " + pokeDois.getHp());

			pokeDois.atacar(pokeUm);
			System.out.println(pokeDois.getNome() + " ataca " + pokeUm.getNome());
			System.out.println(pokeUm.getNome() + " está com hp " + pokeUm.getHp());

			int recuperacao = aleatorio.nextInt(10);
			pokeUm.recuperarHp(recuperacao);
			System.out.println("Você consegue, " + pokeUm.getNome() + "!");
			System.out.println(pokeUm.getNome() + " recuperou " + recuperacao + " de hp!");

			recuperacao = aleatorio.nextInt(10);
			pokeDois.recuperarHp(recuperacao);
			System.out.println("Você consegue, " + pokeDois.getNome() + "!");
			System.out.println(pokeDois.getNome() + " recuperou " + recuperacao + " de hp!");

			System.out.println("");

		}

		if (pokeUm.estaVivo()) {
			System.out.println(pokeUm.getNome() + " é o vencedor!");
		} else {
			System.out.println(pokeDois.getNome() + " é o vencedor!");
		}
		
		  
	  }
	

}
