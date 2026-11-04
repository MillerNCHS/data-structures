/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        this.root = null;
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable obj) 
    {   
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;

        if (this.root == null)
            this.root = newNode;
        else
            this.root.addNode(newNode);
    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable obj)
    {
        Node current = this.root;
        while (current != null) {
            int diff = obj.compareTo(current.data);
            if (diff == 0)
                return true;
            else if (diff < 0)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable obj)
    {
        Node toBeRemoved = this.root;
        boolean found = false;
        Node parent = null;

        while (!found && toBeRemoved != null) {
            int diff = obj.compareTo(toBeRemoved.data);
            if (diff == 0)
                found = true;
            else if (diff < 0) {
                parent = toBeRemoved;
                toBeRemoved = toBeRemoved.left;
            }
            else {
                parent = toBeRemoved;
                toBeRemoved = toBeRemoved.right;
            }
        }

        if (!found)
            return;
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        
    }   

    /**
        Prints a node and all of its descendants in sorted order.
        @param parent the root of the subtree to print
    */
    private static void print(Node parent)
    {   
        
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
        // A BST MUST BE made of Comparable objects
        public Comparable data;
        public Node left;
        public Node right;

        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            // If diff < 0, newNode is to the left of this node
            // If diff > 0, newNode is to the right of this node
            int diff = newNode.data.compareTo(data);

            if (diff < 0) {
                if (left == null)
                    left = newNode;
                else
                    left.addNode(newNode);
            }
            else if (diff > 0) {
                if (right == null)
                    right = newNode;
                else
                    right.addNode(newNode);
            }
        }
    }
}



