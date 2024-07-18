/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countPairs(TreeNode root, int distance) {
        HashMap<TreeNode,List<TreeNode>> map=new HashMap<>();
        List<TreeNode> list=new ArrayList<>();
           findLeaves(root, new ArrayList<>(),list, map);
        int res=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                List<TreeNode> one=map.get(list.get(i));
                List<TreeNode> two=map.get(list.get(j));
                for(int k=0;k<Math.min(one.size(),two.size());k++){
                    if(one.get(k)!=two.get(k)){
                        int dis =one.size()-k+two.size()-k;
                        if(dis <=distance){
                            res++;
                        }
                        break;
                    }
                }
            }
        }
        return res;
    }
    private void findLeaves(TreeNode node, List<TreeNode> trail, List<TreeNode> leaves,                     Map<TreeNode, List<TreeNode>> map) {
        if (node == null) return;
        List<TreeNode> tmp = new ArrayList<>(trail);
        tmp.add(node);
        if (node.left == null && node.right == null) {
            map.put(node, tmp);
            leaves.add(node);
            return;
        }
        findLeaves(node.left, tmp, leaves, map);
        findLeaves(node.right, tmp, leaves, map);
    }
}