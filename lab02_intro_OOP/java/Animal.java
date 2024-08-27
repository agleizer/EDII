public class Animal {
  // atributos
  private String nome;
  private float comprimento;
  private int numPatas;
  private String cor;
  private String ambiente;
  private float velocMedia;

  // construtores
  public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia) {
    this.nome = nome;
    this.comprimento = comprimento;
    this.numPatas = numPatas;
    this.cor = cor;
    this.ambiente = ambiente;
    this.velocMedia = velocMedia;
  }

  public Animal() {
    this.nome = "";
    this.comprimento = 0;
    this.numPatas = 0;
    this.cor = "";
    this.ambiente = "";
    this.velocMedia = 0;
  }

  // getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getComprimento() {
    return comprimento;
  }

  public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
  }

  public int getNumPatas() {
    return numPatas;
  }

  public void setNumPatas(int numPatas) {
    this.numPatas = numPatas;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public float getVelocMedia() {
    return velocMedia;
  }

  public void setVelocMedia(float velocMedia) {
    this.velocMedia = velocMedia;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  // metodos
  public void dados() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Comprimento: " + this.comprimento);
    System.out.println("Número de patas: " + this.numPatas);
    System.out.println("Ambiente: " + this.ambiente);
    System.out.println("Velocidade média: " + this.velocMedia);
  }

}