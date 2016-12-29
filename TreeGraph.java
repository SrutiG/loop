public class TreeGraph {

    public HashSet<TreeNode> values;
    public TreeNode root;

    public TreeGraph(String data) {
        values = new HashSet<>();
        root = new TreeNode(data);
        values.add(root);
    }

    public boolean add(String data, String context, int distance) {
        TreeNode sibling = new TreeNode(context);
        if (values.get(context) == null) {
            return false;
        }
        TreeNode current = new TreeNode(data);
        MapKey<TreeNode, int> currentToSib = new MapKey(sibling, distance);
        MapKey<TreeNode, int> sibToCurrent = new MapKey(context, distance);
        current.addChild(currentToSib);
        sibling.addChild(sibToCurrent);
    }


}