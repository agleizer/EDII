import java.util.Random;

public abstract class Pokemon {
	
	// atributos
	private String nome;
	private String tipo;
	private int nivel;
	private int hp;
	private Random aleatorio = new Random();
	
	// construtores
	public Pokemon() {
		this.nome = "";
		this.tipo = "";
		this.nivel = 0;
		this.hp = 0;
	}
	
	public Pokemon(String nome, String tipo, int nivel, int hp) {
		this.nome = nome;
		this.nome = tipo;
		this.nivel = nivel;
		this.hp = hp;
	}
	
	// getters e setters	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// metodos
	public abstract void atacar(Pokemon inimigo);
	
	public void receberDano(int dano) {
		this.hp = hp - dano;
		if (this.hp < 0) hp = 0;
	}
	
	public void recuperarHp() {
		this.hp = hp + aleatorio.nextInt(50);
	}	
	
	public void recuperarHp(int quantidade) {
		this.hp = hp + quantidade;
	}

	public Boolean estaVivo() {
		return hp > 0;
	}
}
