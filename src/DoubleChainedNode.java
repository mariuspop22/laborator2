public class DoubleChainedNode implements INode {
    private int value;
    private DoubleChainedNode next, prev;

    public DoubleChainedNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int val) {
        this.value = val;
    }

    public void setNextNode(DoubleChainedNode n) {
        this.next = n;
    }

    public void setPrevNode(DoubleChainedNode p) {
        this.prev = p;
    }

    public DoubleChainedNode getNextNode() {
        return next;
    }

    public DoubleChainedNode getPrevNode() {
        return prev;
    }
}

