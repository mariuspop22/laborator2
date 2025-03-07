public class SimpleChainedList {
    private SimpleChainedNode head;

    public SimpleChainedList() {
        this.head = null;
    }

    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            SimpleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
    }

    public void removeNodeByValue(int value) {
        if (head == null) return;

        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }

        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null && temp.getNextNode().getValue() != value) {
            temp = temp.getNextNode();
        }

        if (temp.getNextNode() != null) {
            temp.setNextNode(temp.getNextNode().getNextNode());
        }
    }

    public void printList() {
        SimpleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println("null");
    }

    public int sumValues() {
        int sum = 0;
        SimpleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    public boolean isSortedAscending() {
        if (head == null || head.getNextNode() == null) return true;

        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }
}



