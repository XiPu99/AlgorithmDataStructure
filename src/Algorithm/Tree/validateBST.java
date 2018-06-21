package Algorithm.Tree;

public class validateBST {
    public boolean isValidBST(TreeNode root) {
        return validBSTHelper(root, null, null);
    }

    public boolean validBSTHelper(TreeNode root, Integer min, Integer max){

        if(root==null) return true;
        if((min!=null&&root.data<=min)||(max!=null&&root.data>=max)) return false;
        return validBSTHelper(root.left, min, root.data)&&validBSTHelper(root.right, root.data, max);
    }

}
