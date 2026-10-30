/**
   This class demonstrates the tree class.
*/
public class TreeDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree("Anne");
      Tree t2 = new Tree("Peter");
      t1.addSubtree(t2);
      Tree t3 = new Tree("Zara");
      t1.addSubtree(t3);
      Tree t4 = new Tree("Savannah");
      t2.addSubtree(t4);
      System.out.println("Size: " + t1.size());

      // Binary Tree Test
      BinaryTree empty = new BinaryTree();
      BinaryTree bt4 = new BinaryTree("Chicago");
      BinaryTree bt3 = new BinaryTree("Atlanta");
      BinaryTree bt2 = new BinaryTree("Miami", bt4, empty);
      BinaryTree bt1 = new BinaryTree("San Diego", bt2, bt3);

      System.out.println("Binary Tree Root: " + bt1.data());
      System.out.println("Binary Tree Height: " + bt1.height());

      System.out.println(binaryTreePrint(bt1));
   }

   public String binaryTreePrint(BinaryTree bt1) {
      BinaryTree tree = bt1;
      String string = "";
      for(int i = 0; i < bt1.height(); i++) {
         if (tree.left() == null && tree.right() == null) {
            return "";
         }
         else {
            if (tree.left() != null) {
               tree
            }
            if (tree.left() != null) {
               tree
            }  
         }
      }
      return string;
   }
}

