public class BinaryTree {
    // attributes
    Node root;

    // constructors
    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    // methods
    public getRoot() {
        return this.root;
    }

    public setRoot(Node node) {
        this.root = node;
    }

    // methods
    public Boolean isEmpty() {
        return (root == null);
    }

    public int getDegree() { // repensar! estava copiando a estrategie recursiva de getHeight do Node mas essa solucao não percorre a arvore
        int maxDegrees = 0;
        Node current = this.root;
        int maxDegreesLeft = 0;
        int maxDegreesRight = 0;
        if (this.left != null) maxDegreesLeft = this.left.getHeight();
        if (this.right != null) maxDegreesRight = this.right.getHeight();
        maxDegrees = leftHeight > rightHeight ? leftHeight : rightHeight;
        return ++maxHeight;
    }


}