package edii_polimorfismo;

public class PokemonFogo extends Pokemon {
	
	// construtores
	public PokemonFogo(String nome, int nivel, int hp) {
		this.setNome(nome);
		this.setNivel(nivel);
		this.setHp(hp);
	}
	
	public void atacar(Pokemon inimigo) {
		if (inimigo instanceof PokemonPlanta) {
			inimigo.receberDano(15);
		} else {
			inimigo.receberDano(10);
		}
		
	}

}
