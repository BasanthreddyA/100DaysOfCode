class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return check(root.left, root.right);
    }

    boolean check(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null){
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val){
            return false;
        }
        return check(node1.left, node2.right) && check(node1.right, node2.left);
    }
}
