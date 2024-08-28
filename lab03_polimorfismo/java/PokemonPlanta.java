
public class PokemonPlanta extends Pokemon {
	
	// construtores
	public PokemonPlanta(String nome, String tipo, int nivel, int hp) {
		this.setNome(nome);
		this.setTipo(tipo);
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
