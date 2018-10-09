package week5;

public class Queue {
    private SLL sll;

    public Queue(SLL sll) {
        this.sll = sll;
    }

    public Queue() {
        this.sll = new SLL();
    }

    public void newQueue() {
        this.sll = new SLL();
    }

    public void Enqueue(int value) {
        this.sll.push(value);
    }

    public void Dequeue() {
        try {
            this.sll.shift();
        } catch (SLLEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    public int Front() {
        return sll.front();
    }

    public int size() {
        return sll.size();
    }

    public boolean isEmpty() {
        return sll.size() == 0;
    }

    public void printQueue() {
        sll.printLists();
    }
}
