/**
   This class demonstrates the tree class.
*/
public class TreeDemo
{
   public static void main(String[] args)
   {
      // --- N-ary Tree Test ---
      Tree t1 = new Tree("Anne");
      Tree t2 = new Tree("Peter");
      Tree t3 = new Tree("Zara");
      Tree t4 = new Tree("Savannah");
      t1.addSubtree(t2);
      t1.addSubtree(t3);
      t2.addSubtree(t4);

      System.out.println("Tree Size: " + t1.size());
      System.out.println();

      // --- Binary Tree Test ---
      BinaryTree empty = new BinaryTree();
      BinaryTree bt4 = new BinaryTree("Savannah");
      BinaryTree bt3 = new BinaryTree("Zara");
      BinaryTree bt2 = new BinaryTree("Peter", bt4, empty);
      BinaryTree bt1 = new BinaryTree("Anne", bt2, bt3);

      System.out.println("Binary Tree Root: " + bt1.data());
      System.out.println("Binary Tree Height: " + bt1.height());
      System.out.println("Left Subtree Root: " + bt1.left().data());
      System.out.println("Right Subtree Root: " + bt1.right().data());
   }
}
