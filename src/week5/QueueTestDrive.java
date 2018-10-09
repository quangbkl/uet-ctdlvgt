package week5;

public class QueueTestDrive {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.push(4);
        sll.push(0);
        sll.unshift(12);
        sll.push(9);
        sll.unshift(34);
        sll.push(2);
        sll.unshift(56);
        sll.printLists();
    }
}
