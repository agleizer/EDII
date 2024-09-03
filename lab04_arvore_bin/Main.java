public class Main {
    public static void main(String[] args) {
        // construção árvore
        BinaryTree arvore = new BinaryTree();
        Node nodeA = new Node("A", null, null, null);
        Node nodeB = new Node("B", nodeA, null, null);
        Node nodeC = new Node("C", nodeA, null, null);
        Node nodeD = new Node("D", nodeB, null, null);
        Node nodeE = new Node("E", nodeC, null, null);
        Node nodeF = new Node("F", nodeC, null, null);
        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);
        nodeB.setLeft(nodeD);
        nodeC.setLeft(nodeE);
        nodeC.setRight(nodeF);
        arvore.setRoot(nodeA);

        // impressão infos nos
        System.out.println("Infos Node A");
        System.out.println("Root: " + nodeA.isRoot());
        System.out.println("Leaf: " + nodeA.isLeaf());
        System.out.println("Degree: " + nodeA.getDegree());
        System.out.println("Level: " + nodeA.getLevel());
        System.out.println("Height: " + nodeA.getHeight());
        System.out.println("------");

        System.out.println("Infos Node B");
        System.out.println("Root: " + nodeB.isRoot());
        System.out.println("Leaf " + nodeB.isLeaf());
        System.out.println("Degree: " + nodeB.getDegree());
        System.out.println("Level: " + nodeB.getLevel());
        System.out.println("Height: " + nodeB.getHeight());
        System.out.println("------");

        System.out.println("Infos Node C");
        System.out.println("Root: " + nodeC.isRoot());
        System.out.println("Leaf " + nodeC.isLeaf());
        System.out.println("Degree: " + nodeC.getDegree());
        System.out.println("Level: " + nodeC.getLevel());
        System.out.println("Height: " + nodeC.getHeight());
        System.out.println("------");

        System.out.println("Infos Node D");
        System.out.println("Root: " + nodeD.isRoot());
        System.out.println("Leaf " + nodeD.isLeaf());
        System.out.println("Degree: " + nodeD.getDegree());
        System.out.println("Level: " + nodeD.getLevel());
        System.out.println("Height: " + nodeD.getHeight());
        System.out.println("------");

        System.out.println("Infos Node E");
        System.out.println("Root: " + nodeE.isRoot());
        System.out.println("Leaf " + nodeE.isLeaf());
        System.out.println("Degree: " + nodeE.getDegree());
        System.out.println("Level: " + nodeE.getLevel());
        System.out.println("Height: " + nodeE.getHeight());
        System.out.println("------");

        System.out.println("Infos Node F");
        System.out.println("Root: " + nodeF.isRoot());
        System.out.println("Leaf " + nodeF.isLeaf());
        System.out.println("Degree: " + nodeF.getDegree());
        System.out.println("Level: " + nodeF.getLevel());
        System.out.println("Height: " + nodeF.getHeight());
        System.out.println("------");

        System.out.println("Infos Árvore");
        System.out.println("Empty: " + arvore.isEmpty());
        System.out.println("Degree: " + arvore.getDegree());
        System.out.println("Height: " + arvore.getHeight());
        System.out.println("inOrderTraversal: ");
        arvore.inOrderTraversal();
        System.out.println("\n");
        System.out.println("preOrderTraversal: ");
        arvore.preOrderTraversal();
        System.out.println("\n");
        System.out.println("postOrderTraversal: ");
        arvore.postOrderTraversal();
        System.out.println("\n");


    }
}