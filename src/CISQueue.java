import java.util.LinkedList;

public class CISQueue {

    // Linked list property.
    private LinkedList<Integer> queue;

    // Size property.
    private int size;

    // Constructor.
    public CISQueue() {
        queue = new LinkedList<>();
        size = 0;
    }

    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(int value) {
        queue.addLast(value);
        size++;
    }

    // Dequeue. This method removes a node from the beginning of the linked list.
    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }
        size--;
        return queue.removeFirst();
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // size. Returns the size of the queue.
    public int size() {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}
    @Override
    public String toString() {
        return "CISQueue{queue=" + queue + ", size=" + size + "}";
    }

}
