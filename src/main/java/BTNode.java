public class BTNode<T> {

    public T element;
    public BTNode<T> left;
    public BTNode<T> right;

    public BTNode(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        String leftVal = (left == null ? "NULL" : left.element.toString());
        String rightVal = (right == null ? "NULL" : right.element.toString());
        return "BTNode{" + "element=" + element + ", left=" + leftVal + ", right=" + rightVal + '}';
    }


}
