package edii_polimorfismo;

public class PokemonPlanta extends Pokemon {
	
	// construtores
	public PokemonPlanta(String nome, int nivel, int hp) {
		this.setNome(nome);
		this.setNivel(nivel);
		this.setHp(hp);
	}
	
	public void atacar(Pokemon inimigo) {
		if (inimigo instanceof PokemonAgua) {
			inimigo.receberDano(15);
		} else {
			inimigo.receberDano(10);
		}
		
	}

}
