public class TreeNode {

    public String data;
    public HashMap<TreeNode, int> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new HashMap<>();
    }

    public void addChild(TreeNode node, int distance) {
        Map.Entry<TreeNode, int> item = new MapItem<>(node, distance);
        children.add(item);
    }

    @Override
    public boolean equals(TreeNode other) {
        if ((other == null) || !(other instanceof TreeNode)) {
            return false;
        }
        TreeNode that = new TreeNode(other);
        if (this.data = that.data) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int value = 17;
        return 31 * value + data.hashCode;
    }

}