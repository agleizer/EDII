public class Peixe extends Animal {
  // atributos
  private String caracteristica;

  // construtores
  public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocMedia,
      String caracteristica) {
    this.setNome(nome);
    this.setComprimento(comprimento);
    this.setNumPatas(numPatas);
    this.setCor(cor);
    this.setAmbiente(ambiente);
    this.setVelocMedia(velocMedia);
    this.caracteristica = caracteristica;
  }

  public String getCaracteristica() {
    return caracteristica;
  }

  public void setCaracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
  }

  // metodos
  public void dados() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Comprimento: " + this.getComprimento());
    System.out.println("Número de patas: " + this.getNumPatas());
    System.out.println("Ambiente: " + this.getAmbiente());
    System.out.println("Velocidade média: " + this.getVelocMedia());
    System.out.println("Característica: " + this.getCaracteristica());

  }

}