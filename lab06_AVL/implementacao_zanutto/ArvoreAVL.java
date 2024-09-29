/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreavl;

/**
 *
 * @author USER
 */
/* 
 * Implementação de árvore AVL, adotando o uso de referências unidirecionais pai->filhos.
*/

public class ArvoreAVL {
    public No raiz;
    
    public int max(int altura_no1, int altura_no2) {
        return (altura_no1 > altura_no2) ? altura_no1 : altura_no2;
    }
    
    public int getAlturaNo(No no) {
        return (no == null) ? -1 : no.altura;
    }
    public No rotacionarDireita(No no) {
        No aux;
        aux = no.esquerda;
        no.esquerda = aux.direita;
        aux.direita = no;
        no.altura = this.max(this.getAlturaNo(no.direita), this.getAlturaNo(no.esquerda))+1;
        aux.altura = this.max(this.getAlturaNo(aux.esquerda), no.altura)+1;
        return aux;
    }
    
    public No rotacionarEsquerda(No no) {
        No aux;
        aux = no.direita;
        no.direita = aux.esquerda;
        aux.esquerda = no;
        no.altura = this.max(this.getAlturaNo(no.direita), this.getAlturaNo(no.esquerda))+1;
        aux.altura = this.max(this.getAlturaNo(aux.direita), no.altura)+1;
        return aux;
    }
    
    public No rotacionarEsquerdaDireita(No no) {
        no.esquerda = this.rotacionarEsquerda(no.esquerda);
        return this.rotacionarDireita(no);
    }
    
    public No rotacionarDireitaEsquerda(No no) {
        no.direita = this.rotacionarDireita(no.direita);
        return this.rotacionarEsquerda(no);
    }
    
   
    public void inserir(int valor) {
        this.raiz =  this.inserir(this.raiz, valor);
    }
    
    
    private No inserir(No raiz, int valor) {
        if(raiz == null) {
            return (new No(valor));
        }
        if(valor <= raiz.valor) {
            raiz.esquerda = inserir(raiz.esquerda, valor);
            if((getAlturaNo(raiz.esquerda) - getAlturaNo(raiz.direita)) == 2)
                if(valor <= raiz.esquerda.valor)
                    raiz = rotacionarDireita(raiz);
                else
                    raiz = rotacionarEsquerdaDireita(raiz);
        }
        else 
            if(valor > raiz.valor) {
              raiz.direita = inserir(raiz.direita, valor);
              if((getAlturaNo(raiz.direita)-getAlturaNo(raiz.esquerda)) == 2)
                  if(valor > raiz.direita.valor)
                      raiz = rotacionarEsquerda(raiz);
                  else
                      raiz = rotacionarDireitaEsquerda(raiz);
            }
        raiz.altura = max(getAlturaNo(raiz.esquerda), getAlturaNo(raiz.direita))+1;
        return raiz;
        }
         
   
    public void exibirArvore() {
        exibirArvore(this.raiz, 0);
    }
    
    private void exibirArvore(No no, int nivel) {
        if(no != null) {
            exibirArvore(no.direita, nivel + 1);
            for(int r = 1; r <= nivel; r++)
              System.out.print(" - ");
            System.out.println(no.valor);
            exibirArvore(no.esquerda, nivel + 1);
        }
    }
    
   
    private No buscar(No pai, int elemento) {
        No atual = this.raiz;
       
        while(atual != null) {
            if(atual.valor == elemento) 
                return atual;
            pai = atual;
            if(atual.valor <= elemento) 
                atual = atual.direita;
            else 
                atual = atual.esquerda;
            }
        return null;
    }

    
    public No buscar(int elemento) {
        return buscar(this.raiz, elemento);
        
    }
    
  
    
    public No antecessor(int elemento) {
        return null;
    
    }
    
        // a arvoreAVL está implementada usando ligaçao unifdiercional
    //  resscrecer  o método sucessor para a versão unidirecional
    
    public No sucessor(int elemento) {
        No atual = this.raiz;   
        No pai = this.raiz; 
        
       atual = buscar(pai, elemento); 
      
        if(atual == null)
            return null;
        if(atual.direita == null) // elemento nao possui filho a direita
              if(atual == raiz) // se o elemento nao tem filho a direita e eh a raiz
                return null;
              else
                      if(pai.valor < elemento) {   
                            while(atual != null) {   // elemento eh filho a direta
             
                         if(pai.valor < elemento) {
                            // percorre os ancestrais do elemento ate encontrar um ancestral 
                            // maior que elemento,caso exista.
                            atual = pai;
                        }
                        else
                                 return pai;
                        // retorno o menor ancestral ancestral que eh maior que elemento,
                       atual = pai;
                    }
                     return null; // elemento eh filho a direita e nao possui ancestral maior que ele.
                }
                else  // elemento eh filho a direita
                            return pai;
                  
        else // o elemento possui filho a direita
            {
            atual = atual.direita;
            while(atual.esquerda != null)
                atual = atual.esquerda;
            return atual;
            }
        }
    
    // a arvoreAVL está implementada usando ligaçao unifdiercional
    //  resscrecer  o método sucessor para a versão unidirecional
      
    
    public void emOrdem() {
        visitarEmOrdem(raiz);
    }
    private void visitarEmOrdem(No no) {
        if(no != null) {
          visitarEmOrdem(no.esquerda);
          System.out.print(no.valor + " ");
          visitarEmOrdem(no.direita);
        }
    }
   
    public void preOrdem() {
        visitarPreOrdem(raiz);
    }
    
    private void visitarPreOrdem(No no) {
        if(no != null) {
          System.out.print(no.valor + " ");
          visitarPreOrdem(no.esquerda);
          visitarPreOrdem(no.direita);
        }
        
    }
    public void posOrdem() {
        visitarPosOrdem(raiz);
    }
     
    private void visitarPosOrdem(No no) {
        if(no != null) {
          visitarPosOrdem(no.esquerda);
          visitarPosOrdem(no.direita);
          System.out.print(no.valor + " ");
        }
        
    }
    public void emLargura() {
        
    }
}