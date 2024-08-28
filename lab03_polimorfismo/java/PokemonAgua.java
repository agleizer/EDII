
public class PokemonAgua extends Pokemon {
	
	// construtores
	public PokemonAgua(String nome, String tipo, int nivel, int hp) {
		this.setNome(nome);
		this.setTipo(tipo);
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
