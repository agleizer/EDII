public class BST extends BinaryTree{

    // construtores
    public BST() {
        this.setRoot(null);
    }

    public BST(Node node) {
        this.setRoot(node);
    }

    public Node search(String data) {
        Node current = this.getRoot();
        // loop para percorrer a arvore
        while (current != null) {
            int result = current.getData().compareTo(data); // comparar dado do Node com a pesquisa
                                                            // retorna 0 se strings iguais
                                                            // +1 se Node > pesquisa, -1 se Node < pesquisa 

            if (result == 0) {
                return current;
            } else if (result > 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        return null; // se sairmos do loops, não encontramos o dado
    }

    // 


}
