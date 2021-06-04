//Daniel Choe

public class TestBST
{
   public static void main(String[] args)
   {
      BinarySearchTree bst = new BinarySearchTree();
      
      bst.add(20);
      bst.add(12);
      bst.add(6);
      bst.add(19);
      bst.add(25);
      bst.add(21);
      bst.add(29);
      bst.add(27);
      bst.add(32);
      bst.add(7);
      bst.add(54);
      bst.add(65);
      bst.add(97);
      
      bst.remove(12); 
      bst.remove(6); 
      bst.remove(7);
      bst.remove(19);  
      //bst.inOrder();
      //bst.balance(); Does not exist
      //bst.inOrder();
      
      bst.preOrder();
      bst.inOrder();
      bst.postOrder();
      System.out.println("Tree Size: " + bst.size());
      System.out.println("Count Leaves: " + bst.countLeaves());
      System.out.println("Tree Height: " + bst.height());
      
   }
}
