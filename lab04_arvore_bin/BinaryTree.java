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
    public Node getRoot() {
        return this.root;
    }

    public void setRoot(Node node) {
        this.root = node;
    }

    // methods
    public Boolean isEmpty() {
        return (root == null);
    }

    public int getDegree() {
        int maxDegrees = 0;
        Node current = this.root;
        int maxDegreesLeft = 0;
        int maxDegreesRight = 0;
        if (current.getLeft() != null) maxDegreesLeft = current.getLeft().getDegree();
        if (current.getRight() != null) maxDegreesRight = current.getRight().getDegree();
        maxDegrees = maxDegreesLeft > maxDegreesRight ? maxDegreesLeft : maxDegreesRight;
        return maxDegrees;
    }

    public int getHeight() {
        return this.root.getHeight(); // chama a funcao getHeight definida na classe Node para root
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    public void levelOrderTraversal(Node node) {
        // usar fila para auxiliar!
    }

    public void levelOrderTraversal() {
        levelOrderTraversal(this.root);
    }

}