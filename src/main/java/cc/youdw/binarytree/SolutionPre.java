package cc.youdw.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <P>前序排列<P>
 *
 * @author youdw
 * @date 2018/2/23 下午6:17
 **/
public class SolutionPre {

    public List<Integer> preorderTraversal(TreeNode root) {
        return preOrderIteratively(root);
    }

    /**
     * 递归方式遍历
     *
     * @param root
     * @param result
     */
    private void preOrder(TreeNode root, List<Integer> result) {
        if (root != null) {
            //根节点
            result.add(root.val);
            //左子节点
            preOrder(root.left, result);
            //右子节点
            preOrder(root.right, result);
        }
    }

    /**
     * 迭代方式解决
     *
     * @param root
     */
    private List<Integer> preOrderIteratively(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        if (root != null) {
            nodeStack.push(root);
            while (!nodeStack.empty()) {
                TreeNode node = nodeStack.pop();
                result.add(node.val);
                if (node.right != null) {
                    nodeStack.push(node.right);
                }
                if (node.left != null) {
                    nodeStack.push(node.left);
                }
            }
        }
        return result;

    }


}
