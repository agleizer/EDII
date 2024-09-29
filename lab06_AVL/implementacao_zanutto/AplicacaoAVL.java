/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreavl;
import java.util.Random;
import java.util.Scanner;

public class AplicacaoAVL {
  public static void main(String[] args) {

    ArvoreAVL avl = new ArvoreAVL();
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    final int AMPLITUDE_SORTEIOS = 800;
    boolean continua = true;
    int opcao, valor, qtd_sorteio;
    do {
      System.out.println("\n1 - insira um elemento");
      System.out.println("2 - insira um sequencia aleatória de n elementos");
      System.out.println("3 - remova um elemento");
      System.out.println("4 - remova um sequencia aleatória de n elementos");
      System.out.println("5 - busque um valor");
      System.out.println("6 - percorra a árvore EmOrdem");
      System.out.println("7 - percorra a árvore PréOrdem");
      System.out.println("8 - percorra a árvore PósOrdem");
      System.out.println("9 - percorra a árvore em largura");
      System.out.println("10 - sucessor de um elemento");
      System.out.println("11 - antecessor de um elemento");
      System.out.println("12 - ancestrais de um elemento");
      System.out.println("13 - exibir árvore");
      System.out.println("14 - sair\n");
      System.out.print("\nDigite sua opção: ");
      opcao = sc.nextInt();
      switch (opcao) {
      case 1:
        System.out.print("Digite o valor a ser inserido na árvore: ");
        valor = sc.nextInt();
        avl.inserir(valor);
        System.out.print("Árvore resultante: ");
        avl.emOrdem();
        break;
      case 2:
        System.out.print("Digite a quantidade de números a serem sorteados "
                         + "para a inserção: ");
        qtd_sorteio = sc.nextInt();
        for (int i = 0; i < qtd_sorteio; i++)
          avl.inserir(r.nextInt(AMPLITUDE_SORTEIOS));
        System.out.print("Árvore resultante: ");
        avl.emOrdem();
        break;
      case 3:
        System.out.print("Digite o valor a ser removido na árvore: ");
        valor = sc.nextInt();
        // avl.remover(valor);
        System.out.print("Árvore resultante: ");
        avl.emOrdem();
        break;
      case 4:
        System.out.print(
            "Digite a quantidade de números a serem sorteados para remoção: ");
        qtd_sorteio = sc.nextInt();
        for (int i = 0; i < qtd_sorteio; i++)
          // avl.remover(r.nextInt(AMPLITUDE_SORTEIOS));
          System.out.print("Árvore resultante: ");
        avl.emOrdem();
        break;
      case 5:
        No noBusca;
        System.out.print("Digite o valor a ser encontrado na árvore: ");
        valor = sc.nextInt();
        noBusca = avl.buscar(valor);
        if (noBusca != null)
          System.out.println("Achou o valor " + noBusca.valor);
        else
          System.out.println("NÃO Achou o valor " + valor);
        break;
      case 6:
        avl.emOrdem();
        break;
      case 7:
        avl.preOrdem();
        break;
      case 8:
        avl.posOrdem();
        break;
      case 9:
        avl.emLargura();
        break;
      case 10:
        int x;
        No sucessor = null;
        System.out.print("Digite o nó que deseja conhecer seu sucessor: ");
        x = sc.nextInt();
        sucessor = avl.sucessor(x);
        if (sucessor != null)
          System.out.print("o sucessor de " + x + " é " + sucessor.valor);
        else
          System.out.print("o nó de valor " + x + " não possui sucessor");
        break;
      case 11: // antecessor
        break;
      case 12:
        System.out.print(
            "Digite o elemento que deseja exibir seus ancestrais: ");
        x = sc.nextInt();
        // avl.ancestrais(x);
        break;
      case 13:
        avl.exibirArvore();
        break;
      case 14:
        continua = false;
        break;
      default:
        System.out.println("\nDigite uma opção válida!\n");
      }
    } while (continua);
  }
}
