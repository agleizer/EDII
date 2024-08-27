package edii_polimorfismo;

public class PokemonAgua extends Pokemon {
	
	// construtores
	public PokemonAgua(String nome, int nivel, int hp) {
		this.setNome(nome);
		this.setNivel(nivel);
		this.setHp(hp);
	}
	
	public void atacar(Pokemon inimigo) {
		if (inimigo instanceof PokemonFogo) {
			inimigo.receberDano(15);
		} else {
			inimigo.receberDano(10);
		}
		
	}

}
