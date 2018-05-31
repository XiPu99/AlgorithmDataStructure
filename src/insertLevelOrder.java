public class insertLevelOrder {

    public static Node buildTreeFromLevelOrder(int[] array, Node root, int index){

        if(index < array.length){
            root = new Node(array[index]);
            root.left = buildTreeFromLevelOrder(array, root.left, 2*index + 1);
            root.right = buildTreeFromLevelOrder(array, root.right, 2*index + 2);
        }

        return root;

    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + "\n");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        Node root = buildTreeFromLevelOrder(arr1, null, 0);
        inorder(root);
        System.out.print("\n");
        int arr2[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        Node root2 = buildTreeFromLevelOrder(arr2, null, 0);
        inorder(root2);

    }

}
