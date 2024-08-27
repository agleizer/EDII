package edii_polimorfismo;
import java.util.Random;

public abstract class Pokemon {
	
	// atributos
	private String nome;
	private int nivel;
	private int hp;
	private Random aleatorio = new Random();
	
	// construtores
	public Pokemon() {
		this.nome = "";
		this.nivel = 0;
		this.hp = 0;
	}
	
	public Pokemon(String nome, int nivel, int hp) {
		this.nome = "nome";
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
	}
	
	public void recuperarHp() {
		this.hp = hp + aleatorio.nextInt(50);
	}	
	
	public void recuperarHp(int quantidade) {
		this.hp = hp + quantidade;
	}

}
