class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void preOrderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
}
public class Person {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root=new TreeNode(1);
        TreeNode r1=new TreeNode(2);
        TreeNode r2=new TreeNode(3);
        TreeNode r3=new TreeNode(4);
        TreeNode r4=new TreeNode(5);
        TreeNode r5=new TreeNode(6);
        root.right=r1;
        r1.right=r4;
        r4.left=r2;
        r4.right=r5;
        r2.right=r3;
        System.out.print("\nPre-order traversal: ");
        tree.preOrderRec(root);
    }
}
