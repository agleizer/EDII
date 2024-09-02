public class Node {
  // atributos
  private String data;
  private Node parent;
  private Node left;
  private Node right;

  // construtores
  public Node() {
    this.data = "";
    this.parent = null;
    this.left = null;
    this.right = null;
  }

  public Node(String data, Node parent, Node left, Node right) {
    this.data = data;
    this.parent = parent;
    this.left = left;
    this.right = right;
  }

  // getters e setters
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  // metodos
  public Boolean isRoot() {
    return (this.parent == null);
  }

  public Boolean isLeaf() {
    return (this.right == null && this.left == null);
  }

  public int getDegree() {
    int degree = 0;
    if (this.left != null) degree++;
    if (this.right != null) degree++;
    return degree;
  }

  public int getLevel() {
    int level = 0;
    Node temp = this;
    while (temp.parent != null) {
      level++;
      temp = temp.parent;
    }
    return level;
  }

  public int getHeight() {
    if (this.isLeaf()) return 0;
    int leftHeight = 0;
    int rightHeight = 0;
    if (this.left != null) leftHeight = this.left.getHeight();
    if (this.right != null) rightHeight = this.right.getHeight();
    int maxHeight = leftHeight > rightHeight ? leftHeight : rightHeight;
    return ++maxHeight;
  }

}