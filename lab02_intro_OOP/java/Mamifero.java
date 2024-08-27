public class Mamifero extends Animal {
  // atributos
  private String alimento;

  // construtores
  public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia,
      String alimento) {
    this.setNome(nome);
    this.setComprimento(comprimento);
    this.setNumPatas(numPatas);
    this.setCor(cor);
    this.setAmbiente(ambiente);
    this.setVelocMedia(velocMedia);
    this.alimento = alimento;
  }

  public String getAlimento() {
    return alimento;
  }

  public void setAlimento(String alimento) {
    this.alimento = alimento;
  }

  // metodos
  @Override
  public void dados() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Comprimento: " + this.getComprimento());
    System.out.println("Número de patas: " + this.getNumPatas());
    System.out.println("Ambiente: " + this.getAmbiente());
    System.out.println("Velocidade média: " + this.getVelocMedia());
    System.out.println("Alimento: " + this.getAlimento());

  }

}